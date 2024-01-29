import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.EOFException;
import java.net.SocketException;

public class ApplicationForm extends JPanel {

    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JButton jButton8;
    private JButton jButton9;
    private JComboBox<String> jComboBox1;
    private JComboBox<String> jComboBox2;
    private JComboBox<String> jComboBox3;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel17;
    private JLabel jLabel18;
    private JLabel jLabel19;
    private JLabel jLabel2;
    private JLabel jLabel20;
    private JLabel jLabel21;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JLabel jLabelID;
    private JLabel jLabelMessage;
    private JLabel jLabelPhotograph;
    private JLabel jLabelSignature;
    private JPasswordField jPasswordField1;
    private JPasswordField jPasswordField2;
    private JSeparator jSeparator1;
    private JSeparator jSeparator2;
    private JTextField jTextField1;
    private JTextField jTextField10;
    private JTextField jTextField11;
    private JTextField jTextField12;
    private JTextField jTextField13;
    private JTextField jTextField14;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JTextField jTextField5;
    private JTextField jTextField6;
    private JTextField jTextField7;
    private JTextField jTextField8;
    private JTextField jTextField9;
    private SerializedApplicationForm applicationForm;

    String firstName, lastName, uniqueId, email, phone, password1, password2;
    String regNo, percentile, obtainedMarks;
    String board, hscRegNo, hscPercentage;
    String branchName;
    String photograph, signature, idProof;
    String extension1, extension2, extension3;
    private int status;

    public ApplicationForm() {
        initComponents();
        addAncestorListeners();
    }

    private void initComponents() {

        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        jLabel11 = new JLabel();
        jLabel12 = new JLabel();
        jLabel13 = new JLabel();
        jLabel14 = new JLabel();
        jLabel15 = new JLabel();
        jLabel16 = new JLabel();
        jLabel17 = new JLabel();
        jLabel18 = new JLabel();
        jLabel19 = new JLabel();
        jLabel20 = new JLabel();
        jLabel21 = new JLabel();
        jLabelMessage = new JLabel();
        jLabelPhotograph = new JLabel();
        jLabelSignature = new JLabel();
        jLabelID = new JLabel();
        jSeparator1 = new JSeparator();
        jSeparator2 = new JSeparator();
        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jTextField3 = new JTextField();
        jTextField4 = new JTextField();
        jTextField5 = new JTextField();
        jTextField7 = new JTextField();
        jTextField6 = new JTextField();
        jTextField8 = new JTextField();
        jTextField9 = new JTextField();
        jTextField10 = new JTextField();
        jTextField11 = new JTextField();
        jTextField12 = new JTextField();
        jTextField13 = new JTextField();
        jTextField14 = new JTextField();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jButton6 = new JButton();
        jButton7 = new JButton();
        jButton8 = new JButton();
        jButton9 = new JButton();
        jComboBox3 = new JComboBox<>();
        jComboBox1 = new JComboBox<>();
        jComboBox2 = new JComboBox<>();
        jPasswordField1 = new JPasswordField();
        jPasswordField2 = new JPasswordField();

        jLabel1.setFont(new Font("Ubuntu Mono", 1, 24)); 
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setIcon(new ImageIcon("/home/near/Alpha/Stack/SDL_SEM5/Client/static/applicant_registration.png")); 
        jLabel1.setBorder(BorderFactory.createEtchedBorder());
        jLabel1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new Font("Dialog", 0, 16)); 
        jLabel2.setText("First Name:");

        jLabel3.setFont(new Font("Dialog", 0, 16)); 
        jLabel3.setText("Last Name:");

        jLabel4.setFont(new Font("Dialog", 0, 16)); 
        jLabel4.setText("ID Type:");

        jLabel5.setFont(new Font("Dialog", 0, 16)); 
        jLabel5.setText("Mobile: ");

        jLabel6.setFont(new Font("Dialog", 0, 16)); 
        jLabel6.setText("ID Number:");

        jLabel7.setFont(new Font("Dialog", 0, 16)); 
        jLabel7.setText("Email:");

        jLabel8.setFont(new Font("Dialog", 0, 16)); 
        jLabel8.setText("Password:");

        jLabel9.setFont(new Font("Dialog", 0, 16)); 
        jLabel9.setText("Confirm Password:");

        jLabel10.setFont(new Font("Dialog", 1, 16)); 
        jLabel10.setText("Entrance Details ");

        jLabel11.setFont(new Font("Dialog", 0, 16)); 
        jLabel11.setText("Registration No.:");

        jLabel12.setFont(new Font("Dialog", 0, 16)); 
        jLabel12.setText("Score (out of 360):");

        jLabel13.setFont(new Font("Dialog", 0, 16)); 
        jLabel13.setText("Percentile:");

        jLabel14.setFont(new Font("Dialog", 1, 16)); 
        jLabel14.setText("HSC Delails");

        jLabel15.setFont(new Font("Dialog", 0, 16)); 
        jLabel15.setText("Registration No.:");

        jLabel16.setFont(new Font("Dialog", 0, 16)); 
        jLabel16.setText("Registration No.:");

        jLabel17.setFont(new Font("Dialog", 0, 16)); 
        jLabel17.setText("Percentage (%):");

        jLabel18.setFont(new Font("Dialog", 0, 16)); 
        jLabel18.setText("Photograph: ");

        jLabel19.setFont(new Font("Dialog", 0, 16)); 
        jLabel19.setText("Signature:");

        jLabel20.setFont(new Font("Dialog", 0, 16)); 
        jLabel20.setText("ID Proof:");

        jLabel21.setFont(new Font("Dialog", 0, 16)); 
        jLabel21.setText("Choose Branch:");

        jLabelMessage.setFont(new Font("Dialog", 2, 16)); 
        jLabelMessage.setVerticalAlignment(SwingConstants.TOP);

        jLabelPhotograph.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelPhotograph.setText("Photograph");
        jLabelPhotograph.setBorder(BorderFactory.createLineBorder(new Color(187, 187, 187)));

        jLabelSignature.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelSignature.setText("Signature");
        jLabelSignature.setBorder(BorderFactory.createLineBorder(new Color(187, 187, 187)));

        jLabelID.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelID.setText("ID Proof");
        jLabelID.setBorder(BorderFactory.createLineBorder(new Color(187, 187, 187)));

        jSeparator1.setBorder(BorderFactory.createLineBorder(new Color(187, 187, 187)));

        jSeparator2.setBorder(BorderFactory.createLineBorder(new Color(187, 187, 187)));

        jTextField1.setFont(new Font("Dialog", 1, 16)); 

        jTextField2.setFont(new Font("Dialog", 1, 16)); 

        jTextField3.setFont(new Font("Dialog", 1, 16)); 

        jTextField4.setFont(new Font("Dialog", 1, 16)); 

        jTextField5.setFont(new Font("Dialog", 1, 16)); 

        jTextField6.setEditable(false);
        jTextField6.setFont(new Font("Dialog", 1, 16)); 
        jTextField6.setHorizontalAlignment(JTextField.CENTER);
        jTextField6.setText("+91");

        jTextField7.setFont(new Font("Dialog", 1, 16)); 

        jTextField8.setFont(new Font("Dialog", 1, 16)); 

        jTextField9.setFont(new Font("Dialog", 1, 16)); 

        jTextField10.setFont(new Font("Dialog", 1, 16)); 

        jTextField11.setFont(new Font("Dialog", 1, 16)); 

        jTextField12.setEditable(false);
        jTextField12.setFont(new Font("Dialog", 1, 14)); 

        jTextField13.setEditable(false);
        jTextField13.setFont(new Font("Dialog", 1, 14)); 

        jTextField14.setEditable(false);
        jTextField14.setFont(new Font("Dialog", 1, 14)); 

        jButton1.setFont(new Font("Ubuntu Mono", 1, 18)); 
        jButton1.setForeground(new Color(13063248));
        jButton1.setText("Back");

        jButton2.setFont(new Font("Ubuntu Mono", 1, 18)); 
        jButton2.setText("Reset");

        jButton3.setFont(new Font("Ubuntu Mono", 1, 18)); 
        jButton3.setText("Submit");

        jButton4.setText("Browse");
        jButton5.setText("Clear");
        jButton6.setText("Browse");
        jButton7.setText("Clear");
        jButton8.setText("Browse");
        jButton9.setText("Clear");

        jComboBox3.setFont(new Font("Dialog", 1, 14)); 
        jComboBox3.setModel(new DefaultComboBoxModel<>(new String[] { "NOT SELECTED" }));

        jComboBox1.setFont(new Font("Dialog", 1, 14)); 
        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[] { "UIDAI", "PASSPORT", "PAN", "DRIVING_LICENSE", "VOTER_ID" }));

        jComboBox2.setFont(new Font("Dialog", 1, 14)); 
        jComboBox2.setModel(new DefaultComboBoxModel<>(new String[] { "CBSE", "STATE" }));

        jPasswordField1.setFont(new Font("Dialog", 1, 16)); 

        jPasswordField2.setFont(new Font("Dialog", 1, 16)); 

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 1266, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jTextField4, GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jLabel2)
                                                                .addComponent(jLabel4)
                                                                .addComponent(jComboBox1, 0, 200, Short.MAX_VALUE)
                                                                .addComponent(jLabel7)
                                                                .addComponent(jTextField1))
                                                        .addGap(38, 38, 38)
                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel3)
                                                                .addComponent(jLabel6))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(jTextField7, GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel8, GroupLayout.Alignment.LEADING)
                                                                .addComponent(jPasswordField1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                                        .addComponent(jLabel10)
                                                        .addComponent(jLabel11)
                                                        .addComponent(jLabel12)
                                                        .addComponent(jTextField9, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel13)
                                                        .addComponent(jTextField8, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                                                .addGap(40, 40, 40)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel17)
                                                        .addComponent(jLabel15)
                                                        .addComponent(jLabel14)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jPasswordField2, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                        .addComponent(jComboBox2, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel16)
                                                        .addComponent(jTextField10)
                                                        .addComponent(jTextField11))))
                                .addGap(39, 39, 39)
                                .addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabelPhotograph, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabelSignature, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabelID, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel19)
                                                                        .addComponent(jLabel18)
                                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                                                .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                        .addComponent(jTextField12, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(jButton5, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                        .addComponent(jTextField13, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
                                                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                                        .addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel20)
                                                                                                                .addComponent(jTextField14, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE))
                                                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                                        .addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)))
                                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                                                .addComponent(jButton7, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                                                                                .addComponent(jButton9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                .addGap(16, 16, 16))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel21)
                                                        .addComponent(jComboBox3, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelMessage, GroupLayout.PREFERRED_SIZE, 580, GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(256, 256, 256)
                                                                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jSeparator2))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addComponent(jSeparator1))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(27, 27, 27)
                                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(jLabel2)
                                                                                        .addComponent(jLabel3))))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(jLabel6)
                                                                                        .addComponent(jLabel4))
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jLabel7)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jLabel5)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(jLabel8)
                                                                                        .addComponent(jLabel9))
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(jPasswordField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jPasswordField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(42, 42, 42)
                                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(jLabel10)
                                                                                        .addComponent(jLabel14))
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(jLabel11)
                                                                                        .addComponent(jLabel15))
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jComboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(jLabel12)
                                                                                        .addComponent(jLabel16, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(jTextField9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jTextField10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(jLabel13)
                                                                                        .addComponent(jLabel17))
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(jTextField8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jTextField11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                                                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                .addContainerGap())
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabelID, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelPhotograph, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelSignature, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
                                                .addGap(27, 27, 27)
                                                .addComponent(jLabel18)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextField12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton4)
                                                        .addComponent(jButton5))
                                                .addGap(21, 21, 21)
                                                .addComponent(jLabel19)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextField13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton6)
                                                        .addComponent(jButton7))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel20)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextField14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton8)
                                                        .addComponent(jButton9))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel21)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jComboBox3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabelMessage, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(73, Short.MAX_VALUE))))
        );
        for(String branch : Main.branches)
            jComboBox3.addItem(branch);
        jLabel10.setText(Main.entrance+" Details ");
        jLabel12.setText("Score (out of "+(int)Main.maxMarks+"):");
    }

    private void addAncestorListeners(){
        jButton1.addActionListener(e -> {
            Main.frame.getContentPane().removeAll();
            Main.frame.setContentPane(new LandingPage());
            Main.frame.setSize(new LandingPage().getPreferredSize());
            Main.frame.setVisible(true);
        });

        jButton2.addActionListener(e -> {
            Main.frame.getContentPane().removeAll();
            Main.frame.setContentPane(new ApplicationForm());
            Main.frame.setSize(new ApplicationForm().getPreferredSize());
            Main.frame.setVisible(true);
        });

        jButton3.addActionListener(e -> {
            try {
                if (formIsValid()) {
                    jLabelMessage.setForeground(Color.RED);
                    jLabelMessage.setText("");
                    Main.dataOutputStream.writeInt(3);
                    prepareApplicationForm();
                    Main.objectOutputStream.writeObject(applicationForm);
                    Main.dataOutputStream.writeUTF(extension1);
                    Main.dataOutputStream.writeUTF(extension2);
                    Main.dataOutputStream.writeUTF(extension3);
                    Main.sendFile(photograph);
                    Main.sendFile(signature);
                    Main.sendFile(idProof);
                    status = Main.dataInputStream.readInt();
                    if(status>=200 && status<=299){
                        String applicantID = Main.dataInputStream.readUTF();
                        RegistrationDialogBox dialogBox = new RegistrationDialogBox(Main.frame,true,applicantID);
                        dialogBox.setLocationRelativeTo(Main.frame);
                        dialogBox.setVisible(true);
                    }else {
                        RegistrationDialogBox dialogBox = new RegistrationDialogBox(Main.frame, true);
                        dialogBox.setLocationRelativeTo(Main.frame);
                        dialogBox.setVisible(true);
                    }
                } else {
                    jLabelMessage.setForeground(Color.GRAY);
                    jLabelMessage.setText("Invalid Form Fields.");
                }
            }catch (SocketException | EOFException exception) {
                Main.raiseErrorPage(new ErrorPage(500,exception));
            }catch (Exception exception){
                Main.raiseErrorPage(new ErrorPage(exception));
            }
        });

        jButton4.addActionListener(e -> {
            FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & PNG Images","jpg","png");
            Main.jFileChooser.setFileFilter(filter);
            if(Main.jFileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
                jTextField12.setText(Main.jFileChooser.getSelectedFile().getAbsolutePath());
                ImageIcon image = new ImageIcon(Main.jFileChooser.getSelectedFile().getAbsolutePath());
                ImageIcon icon = new ImageIcon(image.getImage().getScaledInstance(140,160, Image.SCALE_SMOOTH));
                jLabelPhotograph.setText("");
                jLabelPhotograph.setIcon(icon);
            }

        });

        jButton6.addActionListener(e -> {
            FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & PNG Images","jpg","png");
            Main.jFileChooser.setFileFilter(filter);
            if(Main.jFileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                jTextField13.setText(Main.jFileChooser.getSelectedFile().getAbsolutePath());
                ImageIcon image = new ImageIcon(Main.jFileChooser.getSelectedFile().getAbsolutePath());
                ImageIcon icon = new ImageIcon(image.getImage().getScaledInstance(140,160, Image.SCALE_SMOOTH));
                jLabelSignature.setText("");
                jLabelSignature.setIcon(icon);

            }
        });

        jButton8.addActionListener(e -> {
            FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & PNG Images","jpg","png");
            Main.jFileChooser.setFileFilter(filter);
            if(Main.jFileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                jTextField14.setText(Main.jFileChooser.getSelectedFile().getAbsolutePath());
                ImageIcon image = new ImageIcon(Main.jFileChooser.getSelectedFile().getAbsolutePath());
                ImageIcon icon = new ImageIcon(image.getImage().getScaledInstance(290,160, Image.SCALE_SMOOTH));
                jLabelID.setText("");
                jLabelID.setIcon(icon);

            }
        });

        jButton5.addActionListener(e -> {
            jLabelPhotograph.setIcon(null);
            jLabelPhotograph.setText("Photograph");
            jTextField12.setText("");
        });

        jButton7.addActionListener(e -> {
            jLabelSignature.setIcon(null);
            jLabelSignature.setText("Signature");
            jTextField13.setText("");
        });

        jButton9.addActionListener(e -> {
            jLabelID.setIcon(null);
            jLabelID.setText("ID Proof");
            jTextField14.setText("");
        });

    }

    private boolean formIsValid(){
        boolean flag = true;
        firstName = jTextField1.getText();
        lastName = jTextField2.getText();
        uniqueId = jTextField3.getText();
        email = jTextField4.getText();
        phone = jTextField5.getText();
        password1 = String.valueOf(jPasswordField1.getPassword());
        password2 = String.valueOf(jPasswordField2.getPassword());
        regNo = jTextField7.getText();
        percentile = jTextField8.getText();
        obtainedMarks = jTextField9.getText();
        board = jComboBox2.getSelectedItem().toString();
        hscRegNo = jTextField10.getText();
        hscPercentage = jTextField11.getText();
        branchName = jComboBox3.getSelectedItem().toString();
        photograph = jTextField12.getText();
        signature = jTextField13.getText();
        idProof = jTextField14.getText();

        if(Validators.isAlpha(firstName)){
            jTextField1.setBorder(null);
        }else{
            jTextField1.setBorder(BorderFactory.createLineBorder(Color.RED));
            flag = false;
        }

        if(Validators.isAlpha(lastName)){
            jTextField2.setBorder(null);
        }else{
            jTextField2.setBorder(BorderFactory.createLineBorder(Color.RED));
            flag = false;
        }

        if(Validators.isAlNum(uniqueId,8,16)){
            jTextField3.setBorder(null);
        }else {
            jTextField3.setBorder(BorderFactory.createLineBorder(Color.RED));
            flag = false;
        }

        if(Validators.isEmail(email)){
            jTextField4.setBorder(null);
        }else{
            jTextField4.setBorder(BorderFactory.createLineBorder(Color.RED));
            flag = false;
        }

        if(Validators.isNum(phone,10,10)){
            jTextField5.setBorder(null);
        }else{
            jTextField5.setBorder(BorderFactory.createLineBorder(Color.RED));
            flag = false;
        }

        if(Validators.isValidPassword(password1,password2,8)){
            jPasswordField1.setBorder(null);
            jPasswordField2.setBorder(null);
        }else {
            jPasswordField1.setBorder(BorderFactory.createLineBorder(Color.RED));
            jPasswordField2.setBorder(BorderFactory.createLineBorder(Color.RED));
            flag = false;
        }

        if (Validators.isAlNum(regNo,8,16)){
            jTextField7.setBorder(null);
        }else {
            jTextField7.setBorder(BorderFactory.createLineBorder(Color.RED));
            flag = false;
        }

        if(Validators.isFloat(obtainedMarks,0,360)){
            jTextField9.setBorder(null);
        }else{
            jTextField9.setBorder(BorderFactory.createLineBorder(Color.RED));
            flag = false;
        }

        if(Validators.isFloat(percentile,0,100)){
            jTextField8.setBorder(null);
        }else {
            jTextField8.setBorder(BorderFactory.createLineBorder(Color.RED));
            flag = false;
        }

        if (Validators.isAlNum(hscRegNo,8,16)){
            jTextField10.setBorder(null);
        }else {
            jTextField10.setBorder(BorderFactory.createLineBorder(Color.RED));
            flag = false;
        }

        if(Validators.isFloat(hscPercentage,0,100)){
            jTextField11.setBorder(null);
        }else {
            jTextField11.setBorder(BorderFactory.createLineBorder(Color.RED));
            flag = false;
        }

        if(photograph.isBlank()){
            jTextField12.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabelPhotograph.setBorder(BorderFactory.createLineBorder(Color.RED));
            flag = false;
        }else{
            jTextField12.setBorder(null);
            jLabelPhotograph.setBorder(BorderFactory.createLineBorder(new Color(187, 187, 187)));
        }

        if(signature.isBlank()){
            jTextField13.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabelSignature.setBorder(BorderFactory.createLineBorder(Color.RED));
            flag = false;
        }else{
            jTextField13.setBorder(null);
            jLabelSignature.setBorder(BorderFactory.createLineBorder(new Color(187, 187, 187)));
        }

        if(idProof.isBlank()){
            jTextField14.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabelID.setBorder(BorderFactory.createLineBorder(Color.RED));
            flag = false;
        }else{
            jTextField14.setBorder(null);
            jLabelID.setBorder(BorderFactory.createLineBorder(new Color(187, 187, 187)));
        }

        if(branchName.equalsIgnoreCase("not selected")){
            jComboBox3.setBorder(BorderFactory.createLineBorder(Color.RED));
            flag = false;
        }else {
            jComboBox3.setBorder(null);
        }

        return flag;
    }

    private void prepareApplicationForm() throws Exception {
        applicationForm = (SerializedApplicationForm) Main.objectInputStream.readObject();
        applicationForm.setFirstName(firstName);
        applicationForm.setLastName(lastName);
        applicationForm.setUniqueId(uniqueId);
        applicationForm.setEmail(email);
        applicationForm.setPhNo(phone);
        applicationForm.setPassword(password1);
        applicationForm.setRegNo(regNo);
        applicationForm.setObtainedMarks(Double.parseDouble(obtainedMarks));
        applicationForm.setPercentile(Double.parseDouble(percentile));
        applicationForm.setHscBoard(board);
        applicationForm.setHscRegNo(hscRegNo);
        applicationForm.setHscPercentage(Double.parseDouble(hscPercentage));
        applicationForm.setBranchName(branchName);

        extension1 = photograph.substring(photograph.lastIndexOf('.') + 1);
        extension2 = signature.substring(signature.lastIndexOf('.') + 1);
        extension3 = idProof.substring(idProof.lastIndexOf('.') + 1);
    }

}
