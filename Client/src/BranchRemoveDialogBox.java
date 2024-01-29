import javax.swing.*;
import java.awt.*;
import java.io.EOFException;
import java.net.SocketException;

public class BranchRemoveDialogBox extends JDialog {

    private JButton jButton1;
    private JComboBox<String> jComboBox1;
    private JLabel jLabel1;
    private JLabel jLabel2;

    public BranchRemoveDialogBox(Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        addActionListeners();
    }

    private void initComponents() {

        jLabel1 = new JLabel();
        jButton1 = new JButton();
        jComboBox1 = new JComboBox<>();
        jLabel2 = new JLabel();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new Font("Dialog", 1, 16)); 
        jLabel1.setText("Branch Name:");

        jButton1.setFont(new Font("Dialog", 1, 16)); 
        jButton1.setText("Remove");

        jComboBox1.setFont(new Font("Dialog", 1, 16)); 
        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[]{"NOT SELECTED"}));
        for(String branch : Main.branches)
            jComboBox1.addItem(branch);

        jLabel2.setFont(new Font("Ubuntu Mono", 1, 18)); 
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setForeground(Color.GRAY);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 387, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(108, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
                .addGap(241, 241, 241))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel1)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }

    private void addActionListeners(){
        jButton1.addActionListener(e -> {
            try{
                String branchName = jComboBox1.getSelectedItem().toString();
                if(!branchName.equalsIgnoreCase("not selected")){
                    Main.dataOutputStream.writeInt(14);
                    Main.dataOutputStream.writeUTF(branchName);
                    int status = Main.dataInputStream.readInt();
                    if(status>=200 && status<=299){
                        dispose();
                        String message = branchName + " Branch Deleted";
                        Dialog dialog = new DialogBox(Main.frame,true,message);
                        dialog.setLocationRelativeTo(Main.frame);
                        dialog.setVisible(true);
                    }else
                        jLabel2.setText(branchName+" Not Found or has Applicants");
                }else
                    jLabel2.setText("No Branch Selected");

            }catch (SocketException | EOFException exception) {
                Main.raiseErrorPage(new ErrorPage(500,exception));
            }catch (Exception exception){
                Main.raiseErrorPage(new ErrorPage(exception));
            }
        });
    }

}
