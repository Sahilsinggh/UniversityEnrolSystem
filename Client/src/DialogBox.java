import javax.swing.*;
import java.awt.*;

public class DialogBox extends JDialog {

    private JButton jButton1;
    private JLabel jLabel1;

    public DialogBox(Frame parent, boolean modal, String message) {
        super(parent, modal);
        initComponents();
        addActionListeners();
        jLabel1.setText(message);
    }

    private void initComponents() {

        jLabel1 = new JLabel();
        jButton1 = new JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new Font("Dialog", 1, 16)); 
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setText("Message");

        jButton1.setFont(new Font("Dialog", 1, 16)); 
        jButton1.setText("OK");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(258, 258, 258)
                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(262, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel1)
                                .addGap(27, 27, 27)
                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(48, Short.MAX_VALUE))
        );
        setResizable(false);
        pack();
    }

    private void addActionListeners(){
        jButton1.addActionListener(e->{
            dispose();
        });
    }
}
