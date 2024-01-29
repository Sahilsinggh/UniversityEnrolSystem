import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.EOFException;
import java.net.SocketException;

public class InitDialogBox extends JDialog {

    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JTextField jTextField5;
    private JTextField jTextField6;

    String banner,entrance,maxMarks,email,contact;

    public InitDialogBox(Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        addActionListeners();
    }

    private void initComponents() {

        jLabel1 = new JLabel();
        jTextField1 = new JTextField();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jLabel2 = new JLabel();
        jTextField2 = new JTextField();
        jLabel3 = new JLabel();
        jTextField3 = new JTextField();
        jButton3 = new JButton();
        jLabel4 = new JLabel();
        jTextField4 = new JTextField();
        jLabel5 = new JLabel();
        jTextField5 = new JTextField();
        jTextField6 = new JTextField();
        jLabel6 = new JLabel();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new Font("Dialog", 1, 16)); 
        jLabel1.setText("Banner:");

        jTextField1.setFont(new Font("Dialog", 1, 16)); 
        jTextField1.setEnabled(false);

        jButton1.setFont(new Font("Dialog", 1, 16)); 
        jButton1.setText("Browse");

        jButton2.setFont(new Font("Dialog", 1, 16)); 
        jButton2.setText("Clear");

        jLabel2.setFont(new Font("Dialog", 1, 16)); 
        jLabel2.setText("Entrance Name:");

        jTextField2.setFont(new Font("Dialog", 1, 16)); 

        jLabel3.setFont(new Font("Dialog", 1, 16)); 
        jLabel3.setText("Max Marks:");

        jTextField3.setFont(new Font("Dialog", 1, 16)); 

        jButton3.setFont(new Font("Dialog", 1, 16)); 
        jButton3.setText("Confirm");

        jLabel4.setFont(new Font("Dialog", 1, 16)); 
        jLabel4.setText("Support Email:");

        jTextField4.setFont(new Font("Dialog", 1, 16)); 

        jLabel5.setFont(new Font("Dialog", 1, 16)); 
        jLabel5.setText("Support Contact:");

        jTextField5.setFont(new Font("Dialog", 1, 16)); 

        jTextField6.setEditable(false);
        jTextField6.setFont(new Font("Dialog", 1, 16)); 
        jTextField6.setHorizontalAlignment(JTextField.CENTER);
        jTextField6.setText("+91");

        jLabel6.setFont(new Font("Ubuntu Mono", 1, 18)); 
        jLabel6.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel6.setForeground(Color.GRAY);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel2)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(jLabel3))
                                                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 464, GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel5)
                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                                .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                        .addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(jTextField5))
                                                                .addComponent(jTextField4, GroupLayout.Alignment.LEADING)
                                                                .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 309, GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(52, 52, 52)
                                                                        .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 309, GroupLayout.PREFERRED_SIZE))
                                                                .addComponent(jLabel6, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(292, 292, 292)
                                                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }

    private void addActionListeners(){
        jButton1.addActionListener(e -> {
            FileNameExtensionFilter filter = new FileNameExtensionFilter("PNG Image","png");
            Main.jFileChooser.setFileFilter(filter);
            if(Main.jFileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
                jTextField1.setText(Main.jFileChooser.getSelectedFile().getAbsolutePath());
        });

        jButton2.addActionListener(e -> {
        });

        jButton3.addActionListener(e -> {
            try{
                if(formIsValid()){
                    Main.dataOutputStream.writeInt(12);
                    Main.dataOutputStream.writeUTF(email);
                    Main.dataOutputStream.writeUTF(contact);
                    Main.dataOutputStream.writeUTF(entrance);
                    Main.dataOutputStream.writeDouble(Double.parseDouble(maxMarks));
                    Main.sendFile(banner);
                    dispose();
                    String message = "Uploaded Details";
                    Dialog dialog = new DialogBox(Main.frame,true,message);
                    dialog.setLocationRelativeTo(Main.frame);
                    dialog.setVisible(true);
                }else jLabel6.setText("Invalid Form Fields");
            }catch (SocketException | EOFException exception) {
                Main.raiseErrorPage(new ErrorPage(500,exception));
            }catch (Exception exception){
                Main.raiseErrorPage(new ErrorPage(exception));
            }
        });

        jTextField1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                jLabel6.setText("");
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                jLabel6.setText("");
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                jLabel6.setText("");
            }
        });

        jTextField2.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                jLabel6.setText("");
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                jLabel6.setText("");
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                jLabel6.setText("");
            }
        });

        jTextField3.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                jLabel6.setText("");
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                jLabel6.setText("");
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                jLabel6.setText("");
            }
        });

        jTextField4.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                jLabel6.setText("");
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                jLabel6.setText("");
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                jLabel6.setText("");
            }
        });

        jTextField5.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                jLabel6.setText("");
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                jLabel6.setText("");
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                jLabel6.setText("");
            }
        });

        jTextField6.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                jLabel6.setText("");
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                jLabel6.setText("");
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                jLabel6.setText("");
            }
        });

    }

    private boolean formIsValid(){
        boolean flag = true;
        banner = jTextField1.getText();
        entrance = jTextField2.getText();
        maxMarks = jTextField3.getText();
        email = jTextField4.getText();
        contact = jTextField5.getText();

        if(banner.isBlank()){
            jTextField1.setBorder(BorderFactory.createLineBorder(Color.RED));
            flag = false;
        }else jTextField1.setBorder(null);

        if(entrance.isBlank()){
            jTextField2.setBorder(BorderFactory.createLineBorder(Color.RED));
            flag = false;
        }else jTextField2.setBorder(null);

        if(!Validators.isFloat(maxMarks)){
            jTextField3.setBorder(BorderFactory.createLineBorder(Color.RED));
            flag = false;
        }else jTextField3.setBorder(null);

        if(!Validators.isEmail(email)){
            jTextField4.setBorder(BorderFactory.createLineBorder(Color.RED));
            flag = false;
        }else jTextField4.setBorder(null);

        if(!Validators.isNum(contact,10,10)){
            jTextField5.setBorder(BorderFactory.createLineBorder(Color.RED));
            flag = false;
        }else jTextField5.setBorder(null);

        return flag;
    }
}
