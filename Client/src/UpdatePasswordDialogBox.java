import javax.swing.*;
import java.awt.*;

public class UpdatePasswordDialogBox extends JDialog {

    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabelMessage;
    private JPasswordField jPasswordField1;
    private JPasswordField jPasswordField2;
    private JPasswordField jPasswordField3;

    public UpdatePasswordDialogBox(Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        addActionListeners();
    }

    private void initComponents() {

        jLabel1 = new JLabel();
        jPasswordField1 = new JPasswordField();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jPasswordField2 = new JPasswordField();
        jPasswordField3 = new JPasswordField();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jLabelMessage = new JLabel();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new Font("Dialog", 0, 16)); 
        jLabel1.setText("Current Password:");

        jPasswordField1.setFont(new Font("Dialog", 1, 16)); 

        jLabel2.setFont(new Font("Dialog", 0, 16)); 
        jLabel2.setText("New Password:");

        jLabel3.setFont(new Font("Dialog", 0, 16)); 
        jLabel3.setText("Confirm Password:");

        jPasswordField2.setFont(new Font("Dialog", 1, 16)); 

        jPasswordField3.setFont(new Font("Dialog", 1, 16)); 

        jButton1.setFont(new Font("Dialog", 1, 16)); 
        jButton1.setText("Cancel");

        jButton2.setFont(new Font("Dialog", 1, 16)); 
        jButton2.setText("Submit");


        jLabelMessage.setFont(new Font("Dialog", 1, 16)); 
        jLabelMessage.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelMessage.setForeground(Color.GRAY);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel2)
                                                                .addComponent(jLabel1)))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jPasswordField2, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jPasswordField1, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jPasswordField3, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(117, 117, 117)
                                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                                .addGap(32, 32, 32)
                                                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(75, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelMessage, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(jPasswordField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jPasswordField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jPasswordField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addComponent(jLabelMessage)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }

    private void addActionListeners(){
        jButton1.addActionListener(e -> {
            dispose();
        });

        jButton2.addActionListener(e -> {
            try {
                String password1 = String.valueOf(jPasswordField1.getPassword());
                String password2 = String.valueOf(jPasswordField2.getPassword());
                String password3 = String.valueOf(jPasswordField3.getPassword());
                jPasswordField1.setText("");
                jPasswordField2.setText("");
                jPasswordField3.setText("");
                if (password1.isBlank())
                    jLabelMessage.setText("Enter Current Passsword");
                else if (Validators.isValidPassword(password2, password3, 8)) {
                    Main.dataOutputStream.writeInt(5);
                    Main.dataOutputStream.writeUTF(password1);
                    Main.dataOutputStream.writeUTF(password2);
                    int status = Main.dataInputStream.readInt();
                    if(status>=200 && status<=299){
                        remove(jButton2);
                        jButton1.setText("Done");
                        jPasswordField1.setEnabled(false);
                        jPasswordField2.setEnabled(false);
                        jPasswordField3.setEnabled(false);
                        jLabelMessage.setText("Success");
                    }
                    else if(status == 401)
                        jLabelMessage.setText("Invalid Current Password");
                    else
                        jLabelMessage.setText("Something Went Wrong");
                } else
                    jLabelMessage.setText("Invalid Password Format(s)");
            }catch (Exception exception){
                jLabelMessage.setText("Something Went Wrong");
            }
        });
    }
}
