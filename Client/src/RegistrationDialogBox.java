import javax.swing.*;
import java.awt.*;

public class RegistrationDialogBox extends JDialog {

    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;

    public RegistrationDialogBox(Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        addActionListeners();
        jLabel1.setText("Registration Failed");
        jLabel1.setForeground(new Color(13063248));
        jLabel2.setText("Duplicate credentials detected");
        jLabel3.setText("If registered try Login or contact Help & Support");

    }
    public RegistrationDialogBox(Frame parent, boolean modal, String applicantID) {
        super(parent, modal);
        initComponents();
        addActionListeners();
        jLabel1.setText("Registration Successful");
        jLabel1.setForeground(new Color(4824148));
        jLabel2.setText("Applicant ID: "+applicantID);
        jLabel3.setText("Use the above Applicant ID for authentication");
    }

    private void initComponents() {

        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jButton1 = new JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new Font("Dialog", 1, 18)); 
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);

        jLabel2.setFont(new Font("Dialog", 1, 16)); 
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);

        jLabel3.setFont(new Font("Dialog", 0, 16)); 
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);

        jButton1.setFont(new Font("Dialog", 1, 16)); 
        jButton1.setText("OK");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                                        .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(212, 212, 212)
                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(19, 19, 19)
                                .addComponent(jLabel3)
                                .addGap(46, 46, 46)
                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(105, Short.MAX_VALUE))
        );
        setResizable(false);
        pack();
    }

    private void addActionListeners(){
        jButton1.addActionListener(e->{
            dispose();
        });
    }

    @Override
    public void dispose() {
        Main.frame.getContentPane().removeAll();
        Main.frame.setContentPane(new LandingPage());
        Main.frame.setSize(new LandingPage().getPreferredSize());
        Main.frame.setVisible(true);
        super.dispose();

    }
}
