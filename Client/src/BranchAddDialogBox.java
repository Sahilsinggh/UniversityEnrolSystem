import javax.swing.*;
import java.awt.*;
import java.io.EOFException;
import java.net.SocketException;

public class BranchAddDialogBox extends JDialog {

    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;

    private String branchName, seats, cutOff;

    public BranchAddDialogBox(Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        addActionListeners();
    }

    private void initComponents() {

        jLabel1 = new JLabel();
        jTextField1 = new JTextField();
        jLabel2 = new JLabel();
        jTextField2 = new JTextField();
        jLabel3 = new JLabel();
        jTextField3 = new JTextField();
        jButton1 = new JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new Font("Dialog", 1, 16)); 
        jLabel1.setText("Branch Name:");

        jTextField1.setFont(new Font("Dialog", 1, 16)); 

        jLabel2.setFont(new Font("Dialog", 1, 16)); 
        jLabel2.setText("Seats:");

        jTextField2.setFont(new Font("Dialog", 1, 16)); 

        jLabel3.setFont(new Font("Dialog", 1, 16)); 
        jLabel3.setText("Cut-Off:");

        jTextField3.setFont(new Font("Dialog", 1, 16)); 

        jButton1.setFont(new Font("Dialog", 1, 16)); 
        jButton1.setText("Add");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 387, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 387, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 387, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }

    private void addActionListeners(){
        jButton1.addActionListener(e -> {
            try{
               if (formIsValid()){
                   Main.dataOutputStream.writeInt(13);
                   Main.dataOutputStream.writeUTF(branchName);
                   Main.dataOutputStream.writeInt(Integer.parseInt(seats));
                   Main.dataOutputStream.writeInt(Integer.parseInt(cutOff));
                   dispose();
                   String message = branchName + " Branch Added";
                   Dialog dialog = new DialogBox(Main.frame,true,message);
                   dialog.setLocationRelativeTo(Main.frame);
                   dialog.setVisible(true);
               }
            }catch (SocketException | EOFException exception) {
                Main.raiseErrorPage(new ErrorPage(500,exception));
            }catch (Exception exception){
                Main.raiseErrorPage(new ErrorPage(exception));
            }
        });
    }

    private boolean formIsValid(){
        boolean flag = true;
        branchName = jTextField1.getText();
        cutOff = jTextField2.getText();
        seats = jTextField3.getText();

        if(branchName.isBlank()){
            jTextField1.setBorder(BorderFactory.createLineBorder(Color.RED));
            flag = false;
        }else jTextField1.setBorder(null);

        if(!Validators.isNum(cutOff)){
            jTextField2.setBorder(BorderFactory.createLineBorder(Color.RED));
            flag = false;
        }else jTextField2.setBorder(null);

        if(!Validators.isNum(seats)){
            jTextField3.setBorder(BorderFactory.createLineBorder(Color.RED));
            flag = false;
        }else jTextField3.setBorder(null);

        return flag;
    }

}
