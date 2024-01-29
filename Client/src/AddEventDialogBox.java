import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.io.EOFException;
import java.net.SocketException;

public class AddEventDialogBox extends JDialog {

    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private String event,date;

    public AddEventDialogBox(Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        addActionListeners();
    }

    private void initComponents() {

        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jTextField1 = new JTextField();
        jLabel3 = new JLabel();
        jButton1 = new JButton();
        jTextField2 = new JTextField();
        jLabel4 = new JLabel();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new Font("Dialog", 1, 16)); 
        jLabel1.setText("Event:");

        jLabel2.setFont(new Font("Dialog", 1, 16)); 
        jLabel2.setText("Commencement Date:");

        jTextField1.setFont(new Font("Dialog", 1, 16)); 

        jLabel3.setFont(new Font("Ubuntu Mono", 1, 18)); 
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setForeground(Color.GRAY);

        jButton1.setFont(new Font("Dialog", 1, 16)); 
        jButton1.setText("Pin");

        jTextField2.setFont(new Font("Dialog", 1, 16)); 

        jLabel4.setFont(new Font("Dialog", 3, 16)); 
        jLabel4.setForeground(new Color(153, 153, 153));
        jLabel4.setText("( YYYY-MM-DD )");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel2)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel4))
                                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 772, GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 8, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(343, 343, 343)
                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                .addGap(38, 38, 38)
                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }

    private void addActionListeners(){
        jButton1.addActionListener(e -> {
            try {
                if(formIsValid()){
                    Main.dataOutputStream.writeInt(16);
                    Main.dataOutputStream.writeUTF(event);
                    Main.dataOutputStream.writeUTF(date);
                    dispose();
                    String message = "Added New Event";
                    Dialog dialog = new DialogBox(Main.frame,true,message);
                    dialog.setLocationRelativeTo(Main.frame);
                    dialog.setVisible(true);
                }else
                    jLabel3.setText("Invalid Form Fields");
            }catch (SocketException | EOFException exception) {
                Main.raiseErrorPage(new ErrorPage(500,exception));
            }catch (Exception exception){
                Main.raiseErrorPage(new ErrorPage(exception));
            }
        });

        jTextField1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                jLabel3.setText("");
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                jLabel3.setText("");
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                jLabel3.setText("");
            }
        });

        jTextField2.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                jLabel3.setText("");
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                jLabel3.setText("");
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                jLabel3.setText("");
            }
        });

    }

    private boolean formIsValid(){
        boolean flag = true;
        event = jTextField1.getText();
        date = jTextField2.getText();

        if(event.isBlank()){
            jTextField1.setBorder(BorderFactory.createLineBorder(Color.RED));
            flag = false;
        }else jTextField1.setBorder(null);

        if(!Validators.isDate(date)){
            jTextField2.setBorder(BorderFactory.createLineBorder(Color.RED));
            flag = false;
        }else jTextField2.setBorder(null);

        return flag;
    }

}
