import javax.swing.*;
import java.awt.*;
import java.io.EOFException;
import java.net.SocketException;

public class AdminRegistrationDialogBox extends JDialog {

    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabelMessage;
    private JLabel jLabelTitle;
    private JPasswordField jPasswordField1;
    private JPasswordField jPasswordField2;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;

    private String username;
    private String firstName;
    private String lastName;
    private String name;
    private String password1;
    private String password2;

    public AdminRegistrationDialogBox(Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        addActionListeners();
    }

    private void initComponents() {

        jLabelTitle = new JLabel();
        jLabelMessage = new JLabel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jTextField3 = new JTextField();
        jPasswordField1 = new JPasswordField();
        jPasswordField2 = new JPasswordField();
        jButton1 = new JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jLabelTitle.setFont(new Font("Dialog", 1, 16)); 
        jLabelTitle.setText("New Admin");

        jLabelMessage.setFont(new Font("Dialog", 1, 16)); 
        jLabelMessage.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelMessage.setForeground(Color.GRAY);
        jLabelMessage.setText(" ");

        jLabel1.setFont(new Font("Dialog", 0, 16)); 
        jLabel1.setText("Username:");

        jLabel2.setFont(new Font("Dialog", 0, 16)); 
        jLabel2.setText("First Name:");

        jLabel3.setFont(new Font("Dialog", 0, 16)); 
        jLabel3.setText("Last Name:");

        jLabel4.setFont(new Font("Dialog", 0, 16)); 
        jLabel4.setText("Password:");

        jLabel5.setFont(new Font("Dialog", 0, 16)); 
        jLabel5.setText("Confirm Password:");

        jTextField1.setFont(new Font("Dialog", 1, 16)); 
        jTextField1.setToolTipText("AlphaNumeric, At Least 4 Characters");

        jTextField2.setFont(new Font("Dialog", 1, 16)); 

        jTextField3.setFont(new Font("Dialog", 1, 16)); 

        jPasswordField1.setFont(new Font("Dialog", 1, 16)); 
        jPasswordField1.setToolTipText("At Least 8 Characters");

        jPasswordField2.setFont(new Font("Dialog", 1, 16)); 
        jPasswordField2.setToolTipText("At Least 8 Characters");

        jButton1.setFont(new Font("Dialog", 1, 16)); 
        jButton1.setText("Submit");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabelMessage, GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(74, 74, 74)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel2)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel4)
                                                                        .addComponent(jLabel3)))
                                                        .addComponent(jLabel5, GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel1))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jPasswordField1, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                                        .addComponent(jPasswordField2, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                                        .addComponent(jTextField1)
                                                        .addComponent(jTextField2, GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jTextField3))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabelTitle)
                                .addGap(266, 266, 266))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(275, 275, 275)
                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabelTitle)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jPasswordField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jPasswordField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addComponent(jLabelMessage)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }

    private void addActionListeners(){
        jButton1.addActionListener(e -> {
            try{
                if(formIsValid()){
                    jTextField1.setText("");
                    jTextField2.setText("");
                    jTextField3.setText("");
                    jPasswordField1.setText("");
                    jPasswordField2.setText("");
                    jLabelMessage.setText(" ");

                    name = firstName+" "+lastName;
                    Main.dataOutputStream.writeInt(5);
                    Main.dataOutputStream.writeUTF(username);
                    Main.dataOutputStream.writeUTF(name);
                    Main.dataOutputStream.writeUTF(password1);
                    int status = Main.dataInputStream.readInt();
                    if(status>=200 && status<=299)
                        jLabelMessage.setText(username+" Registered");
                    else
                        jLabelMessage.setText("duplicate username");

                } else {
                    jLabelMessage.setText("Invalid Form Fields");
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
        username = jTextField1.getText();
        firstName = jTextField2.getText();
        lastName = jTextField3.getText();
        password1 = String.valueOf(jPasswordField1.getPassword());
        password2 = String.valueOf(jPasswordField2.getPassword());

        if(Validators.isAlNum(username,4,64)){
            jTextField1.setBorder(null);
        }else {
            jTextField1.setBorder(BorderFactory.createLineBorder(Color.RED));
            flag = false;
        }

        if(firstName.isBlank()){
            jTextField2.setBorder(BorderFactory.createLineBorder(Color.RED));
            flag = false;
        }else{
            jTextField2.setBorder(null);
        }

        if(lastName.isBlank()){
            jTextField3.setBorder(BorderFactory.createLineBorder(Color.RED));
            flag = false;
        }else{
            jTextField3.setBorder(null);
        }

        if(Validators.isValidPassword(password1,password2,8)){
            jPasswordField1.setBorder(null);
            jPasswordField2.setBorder(null);
        }else {
            jPasswordField1.setBorder(BorderFactory.createLineBorder(Color.RED));
            jPasswordField2.setBorder(BorderFactory.createLineBorder(Color.RED));
            flag = false;
        }

        return flag;
    }

}
