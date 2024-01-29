import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.io.EOFException;
import java.net.SocketException;

public class DisqualifyApplicantDialogBox extends JDialog {

    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabelMessage;
    private JTextField jTextField1;

    public DisqualifyApplicantDialogBox(Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        addActionListeners();
    }

    private void initComponents() {

        jLabel1 = new JLabel();
        jLabelMessage = new JLabel();
        jTextField1 = new JTextField();
        jButton1 = new JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new Font("Dialog", 1, 16)); 
        jLabel1.setText("Applicant ID:");

        jLabelMessage.setFont(new Font("Dialog", 3, 16)); 
        jLabelMessage.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelMessage.setForeground(Color.GRAY);

        jTextField1.setFont(new Font("Dialog", 1, 16)); 

        jButton1.setFont(new Font("Dialog", 1, 16)); 
        jButton1.setText("Disqualify");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 387, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(92, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelMessage, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addComponent(jLabelMessage)
                                .addContainerGap(227, Short.MAX_VALUE))
        );

        pack();
    }

    private void addActionListeners(){
        jButton1.addActionListener(e -> {
            try{
                String applicantId = jTextField1.getText();
                if(applicantId.isBlank()){
                    jTextField1.setBorder(BorderFactory.createLineBorder(Color.RED));
                }else{
                    Main.dataOutputStream.writeInt(10);
                    Main.dataOutputStream.writeUTF(applicantId);
                    int status = Main.dataInputStream.readInt();
                    jTextField1.setText("");
                    if(status>=200 && status<=299)
                        jLabelMessage.setText("Disqualified "+applicantId);
                    else
                        jLabelMessage.setText("Invalid Status for "+applicantId);
                }
            }catch (SocketException | EOFException exception) {
                Main.raiseErrorPage(new ErrorPage(500,exception));
            }catch (Exception exception){
                Main.raiseErrorPage(new ErrorPage(exception));
            }
        });

        jTextField1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                jLabelMessage.setText("");
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                jLabelMessage.setText("");
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                jLabelMessage.setText("");
            }
        });
    }
}
