import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.io.EOFException;
import java.net.SocketException;

public class AdminLogin extends JPanel {

    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JPasswordField jPasswordField1;
    private JTextField jTextField1;
    private int status;

    public AdminLogin() {
        initComponents();
        addEventListeners();
    }

    private void initComponents() {

        jButton1 = new JButton();
        jButton2 = new JButton();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jTextField1 = new JTextField();
        jPasswordField1 = new JPasswordField();

        jButton1.setFont(new Font("Ubuntu Mono", 1, 18)); 
        jButton1.setForeground(new Color(13063248));
        jButton1.setText("Back");

        jButton2.setFont(new Font("Ubuntu Mono", 1, 18)); 
        jButton2.setText("Login");

        jLabel1.setFont(new Font("Ubuntu Mono", 1, 18)); 
        jLabel1.setText("Username:");

        jLabel2.setFont(new Font("Ubuntu Mono", 1, 24)); 
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setIcon(new ImageIcon("static/admin_login.png")); 
        jLabel2.setBorder(BorderFactory.createEtchedBorder());
        jLabel2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

        jLabel3.setFont(new Font("Ubuntu Mono", 1, 18)); 
        jLabel3.setText("Password:");

        jLabel4.setFont(new Font("Ubuntu Mono", 1, 18)); 
        jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel4.setForeground(Color.GRAY);

        jTextField1.setFont(new Font("Ubuntu Mono", 1, 18)); 

        jPasswordField1.setFont(new Font("Ubuntu Mono", 1, 18)); 

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 1256, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(445, 445, 445)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jTextField1)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jPasswordField1, GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                                        .addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(573, 573, 573)
                                                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel3)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPasswordField1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(282, Short.MAX_VALUE))
        );
    }

    private void addEventListeners(){
        // Back
        jButton1.addActionListener(e -> {
            Main.frame.getContentPane().removeAll();
            Main.frame.setContentPane(new LandingPage());
            Main.frame.setSize(new LandingPage().getPreferredSize());
            Main.frame.setVisible(true);
        });

        // Login
        jButton2.addActionListener(e-> {
            try{
                Main.dataOutputStream.writeInt(1);
                String username = jTextField1.getText();
                String password = String.valueOf(jPasswordField1.getPassword());
                login(username,password);
            }catch (SocketException | EOFException exception) {
                Main.raiseErrorPage(new ErrorPage(500,exception));
            }catch (Exception exception){
                Main.raiseErrorPage(new ErrorPage(exception));
            }
        });

        jTextField1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                jLabel4.setText("");
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                jLabel4.setText("");
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                jLabel4.setText("");
            }
        });

        jPasswordField1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                jLabel4.setText("");
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                jLabel4.setText("");
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                jLabel4.setText("");
            }
        });
    }

    private void login(String username,String password) throws Exception{
        Main.dataOutputStream.writeUTF(username);
        Main.dataOutputStream.writeUTF(password);
        status = Main.dataInputStream.readInt();
        if(status>=200 && status<=299){
            status = Main.dataInputStream.readInt();
            if(status>=200 && status<=299) {
                String name = Main.dataInputStream.readUTF();
                Main.frame.getContentPane().removeAll();
                Main.frame.setContentPane(new AdminPage(name));
                Main.frame.setSize(new AdminPage().getPreferredSize());
                Main.frame.setVisible(true);
            }else{
                Dialog dialog = new LoginFailedDialogBox(Main.frame,true);
                dialog.setLocationRelativeTo(Main.frame);
                dialog.setVisible(true);
            }
        }else if (status==401)
            jLabel4.setText("Invalid username or password");
    }

}
