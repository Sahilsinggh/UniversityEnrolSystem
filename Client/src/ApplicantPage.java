import javax.swing.*;
import java.awt.*;
import java.io.EOFException;
import java.net.SocketException;

public class ApplicantPage extends JPanel {

    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JLabel jLabel1;
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
    private JLabel jLabel22;
    private JLabel jLabel23;
    private JLabel jLabel24;
    private JLabel jLabel25;
    private JLabel jLabel26;
    private JLabel jLabel27;
    private JLabel jLabel28;
    private JLabel jLabel29;
    private JLabel jLabel3;
    private JLabel jLabel30;
    private JLabel jLabel31;
    private JLabel jLabel32;
    private JLabel jLabel33;
    private JLabel jLabel34;
    private JLabel jLabel35;
    private JLabel jLabel36;
    private JLabel jLabel37;
    private JLabel jLabel38;
    private JLabel jLabel39;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JSeparator jSeparator1;

    SerializedApplicant applicant;
    Main.Status status;

    public ApplicantPage() {
        initComponents();
    }
    public ApplicantPage(SerializedApplicant applicant) {
        initComponents();
        this.applicant = applicant;
        renderDetails();
        addActionListeners();
    }

    private void initComponents() {

        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jButton6 = new JButton();
        jButton7 = new JButton();
        jLabel1 = new JLabel();
        jPanel1 = new JPanel();
        jSeparator1 = new JSeparator();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
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
        jLabel22 = new JLabel();
        jLabel23 = new JLabel();
        jLabel24 = new JLabel();
        jLabel25 = new JLabel();
        jLabel26 = new JLabel();
        jLabel27 = new JLabel();
        jLabel28 = new JLabel();
        jLabel29 = new JLabel();
        jLabel30 = new JLabel();
        jLabel31 = new JLabel();
        jLabel32 = new JLabel();
        jLabel33 = new JLabel();
        jLabel34 = new JLabel();
        jLabel35 = new JLabel();
        jLabel36 = new JLabel();
        jLabel37 = new JLabel();
        jLabel38 = new JLabel();
        jLabel39 = new JLabel();

        setPreferredSize(new Dimension(1250, 750));

        jButton1.setFont(new Font("Dialog", 1, 16)); 
        jButton1.setText("STATUS");
        jButton1.setEnabled(false);

        jButton2.setFont(new Font("Dialog", 1, 16)); 
        jButton2.setText("Float Seat");

        jButton3.setFont(new Font("Dialog", 1, 16)); 
        jButton3.setText("Lock Seat");

        jButton4.setFont(new Font("Dialog", 1, 16)); 
        jButton4.setText("Enrollment Form");

        jButton5.setFont(new Font("Dialog", 1, 16)); 
        jButton5.setText("Change Password");

        jButton6.setFont(new Font("Dialog", 1, 16)); 
        jButton6.setForeground(new Color(13063248));
        jButton6.setText("Logout");

        jButton7.setFont(new Font("Dialog", 1, 16)); 
        jButton7.setText("Refresh");

        jLabel1.setFont(new Font("Ubuntu Mono", 1, 24)); 
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setIcon(new ImageIcon("static/applicant_page.png")); 
        jLabel1.setBorder(BorderFactory.createEtchedBorder());
        jLabel1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

        jLabel39.setFont(new Font("Dialog", 3, 16)); 
        jLabel39.setText("Status:");

        jPanel1.setBorder(BorderFactory.createLineBorder(new Color(187, 187, 187)));

        jSeparator1.setBorder(BorderFactory.createLineBorder(new Color(187, 187, 187)));

        jLabel2.setFont(new Font("Dialog", 3, 16)); 
        jLabel2.setText("Applicant Details");

        jLabel3.setFont(new Font("Dialog", 2, 16)); 
        jLabel3.setText("Applicant ID:");

        jLabel4.setFont(new Font("Dialog", 2, 16)); 
        jLabel4.setText("First Name:");

        jLabel5.setFont(new Font("Dialog", 2, 16)); 
        jLabel5.setText("Last Name:");

        jLabel6.setFont(new Font("Dialog", 2, 16)); 
        jLabel6.setText("Unique ID:");

        jLabel7.setFont(new Font("Dialog", 2, 16)); 
        jLabel7.setText("Email:");

        jLabel8.setFont(new Font("Dialog", 2, 16)); 
        jLabel8.setText("Contact: ");

        jLabel9.setFont(new Font("Dialog", 3, 16)); 
        jLabel9.setText("Entrance Details");

        jLabel11.setFont(new Font("Dialog", 2, 16)); 
        jLabel11.setText("Reg No: ");

        jLabel12.setFont(new Font("Dialog", 2, 16)); 
        jLabel12.setText("Score:");

        jLabel13.setFont(new Font("Dialog", 2, 16)); 
        jLabel13.setText("Percentile:");

        jLabel14.setFont(new Font("Dialog", 3, 16)); 
        jLabel14.setText("HSC Details");

        jLabel15.setFont(new Font("Dialog", 2, 16)); 
        jLabel15.setText("Board:");

        jLabel16.setFont(new Font("Dialog", 2, 16)); 
        jLabel16.setText("Reg No: ");

        jLabel17.setFont(new Font("Dialog", 2, 16)); 
        jLabel17.setText("Percentage:");

        jLabel18.setFont(new Font("Dialog", 3, 16)); 
        jLabel18.setText("Application Status");

        jLabel19.setFont(new Font("Dialog", 2, 16)); 
        jLabel19.setText("Applied Branch:");

        jLabel20.setFont(new Font("Dialog", 2, 16)); 
        jLabel20.setText("Staus:");

        jLabel21.setFont(new Font("Dialog", 2, 16)); 
        jLabel21.setText("Enrollment Form:");

        jLabel22.setFont(new Font("Dialog", 2, 16)); 
        jLabel22.setText("Enrollment ID: ");

        jLabel23.setFont(new Font("Dialog", 1, 16)); 
        jLabel23.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel23.setText("XXXXXXXXXXXXXXXX");

        jLabel24.setFont(new Font("Dialog", 1, 16)); 
        jLabel24.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel24.setText("XXXXXXXXXXXXXXXX");

        jLabel25.setFont(new Font("Dialog", 1, 16)); 
        jLabel25.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel25.setText("XXXXXXXXXXXXXXXX");

        jLabel26.setFont(new Font("Dialog", 1, 16)); 
        jLabel26.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel26.setText("XXXXXXXXXXXXXXXX");

        jLabel27.setFont(new Font("Dialog", 1, 16)); 
        jLabel27.setText("XXXXXXXXXXXXXXXX");

        jLabel28.setFont(new Font("Dialog", 1, 16)); 
        jLabel28.setText("XXXXXXXXXXXXXXXX");

        jLabel29.setFont(new Font("Dialog", 1, 16)); 
        jLabel29.setText("XXXXXXXXXXXXXXXX");

        jLabel30.setFont(new Font("Dialog", 1, 16)); 
        jLabel30.setText("XXXXXXXXXXXXXXXX");

        jLabel31.setFont(new Font("Dialog", 1, 16)); 
        jLabel31.setText("XXXXXXXXXXXXXXXX");

        jLabel32.setFont(new Font("Dialog", 1, 16)); 
        jLabel32.setText("XXXXXXXXXXXXXXXX");

        jLabel33.setFont(new Font("Dialog", 1, 16)); 
        jLabel33.setText("XXXXXXXXXXXXXXXX");

        jLabel34.setFont(new Font("Dialog", 1, 16)); 
        jLabel34.setText("XXXXXXXXXXXXXXXX");

        jLabel35.setFont(new Font("Dialog", 1, 16)); 
        jLabel35.setText("XXXXXXXXXXXXXXXX");

        jLabel36.setFont(new Font("Dialog", 1, 16)); 
        jLabel36.setText("XXXXXXXXXXXXXXXX");

        jLabel37.setFont(new Font("Dialog", 1, 16)); 
        jLabel37.setText("XXXXXXXXXXXXXXXX");

        jLabel38.setFont(new Font("Dialog", 1, 16)); 
        jLabel38.setText("XXXXXXXXXXXXXXXX");


        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel2)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel17)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel34))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel4))
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel23))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel25)
                                                                        .addComponent(jLabel24)
                                                                        .addComponent(jLabel26)
                                                                        .addComponent(jLabel27)
                                                                        .addComponent(jLabel28)))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel12)
                                                        .addComponent(jLabel13)
                                                        .addComponent(jLabel15)
                                                        .addComponent(jLabel16))
                                                .addGap(28, 28, 28)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel33)
                                                        .addComponent(jLabel32)
                                                        .addComponent(jLabel31)
                                                        .addComponent(jLabel30)
                                                        .addComponent(jLabel29)))
                                        .addComponent(jLabel11))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                                .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel18)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel19)
                                                                .addGap(18, 18, 18))
                                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel20)
                                                                .addGap(91, 91, 91)))
                                                .addGap(12, 12, 12)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel35)
                                                        .addComponent(jLabel36)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel21)
                                                        .addComponent(jLabel22))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel38)
                                                        .addComponent(jLabel37))))
                                .addGap(90, 90, 90))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(14, 14, 14)
                                                                .addComponent(jLabel2))
                                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel18)))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel3)
                                                                        .addComponent(jLabel23))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel4)
                                                                        .addComponent(jLabel24, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
                                                                .addGap(7, 7, 7)
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel5)
                                                                        .addComponent(jLabel25))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel6)
                                                                        .addComponent(jLabel26))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel27))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel8)
                                                                        .addComponent(jLabel28))
                                                                .addGap(26, 26, 26)
                                                                .addComponent(jLabel9)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel11)
                                                                        .addComponent(jLabel29, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel12)
                                                                        .addComponent(jLabel30))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel13)
                                                                        .addComponent(jLabel31))
                                                                .addGap(27, 27, 27)
                                                                .addComponent(jLabel14)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel15)
                                                                        .addComponent(jLabel32))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel16)
                                                                        .addComponent(jLabel33)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel19)
                                                                        .addComponent(jLabel35))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel20)
                                                                        .addComponent(jLabel36))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel21)
                                                                        .addComponent(jLabel37, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel22)
                                                                        .addComponent(jLabel38))))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel17)
                                                        .addComponent(jLabel34))
                                                .addGap(0, 147, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jSeparator1)))
                                .addContainerGap())
        );

        jButton7.setFont(new Font("Dialog", 1, 16)); 
        jButton7.setText("Refresh");

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jButton6, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                        .addComponent(jButton5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(50, 50, 50)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel39)
                                                )))
                                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel39)
                                                .addGap(2, 2, 2)
                                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(84, Short.MAX_VALUE))
        );
    }

    private void addActionListeners(){
        // Float Seat
        jButton2.addActionListener(e ->{
            try{
                if(status == Main.Status.SHORTLISTED){
                    Main.dataOutputStream.writeInt(1);
                    int ack = Main.dataInputStream.readInt();
                    if(ack>=200 && ack<=299) {
                        String message = "Status set to FLOATED";
                        Dialog dialog = new DialogBox(Main.frame, true, message);
                        dialog.setLocationRelativeTo(Main.frame);
                        dialog.setVisible(true);
                        jButton7.doClick();
                    }
                    else Main.raiseErrorPage(new ErrorPage(ack));
                }else {
                    String message = "Status required: SHORTLISTED";
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

        // Lock Seat
        jButton3.addActionListener(e -> {
            try{
                if(status==Main.Status.SHORTLISTED || status==Main.Status.FLOATED){
                    Main.dataOutputStream.writeInt(2);
                    int ack = Main.dataInputStream.readInt();
                    if(ack>=200 && ack<=299) {
                        String message = "Status set to LOCKED";
                        Dialog dialog = new DialogBox(Main.frame, true, message);
                        dialog.setLocationRelativeTo(Main.frame);
                        dialog.setVisible(true);
                        jButton7.doClick();
                    }
                    else Main.raiseErrorPage(new ErrorPage(ack));
                }else {
                    String message = "Status required: SHORTLISTED or FLOATED";
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

        jButton4.addActionListener(e -> {
            if(applicant.hasEnrollmentForm()){
                Dialog dialog = new EnrollmentFormDialogBox(Main.frame,true);
                dialog.setLocationRelativeTo(Main.frame);
                dialog.setVisible(true);
            }else{
                String message = "Enrollment Forms are not Issued";
                Dialog dialog = new DialogBox(Main.frame,true,message);
                dialog.setLocationRelativeTo(Main.frame);
                dialog.setVisible(true);
            }
        });

        // Update Password
        jButton5.addActionListener(e -> {
            Dialog dialog = new UpdatePasswordDialogBox(Main.frame,true);
            dialog.setLocationRelativeTo(Main.frame);
            dialog.setVisible(true);
        });

        // Logout
        jButton6.addActionListener(e -> {
            try {
                Main.dataOutputStream.writeInt(0);
                applicant = null;
                Main.frame.getContentPane().removeAll();
                Main.frame.setContentPane(new LandingPage());
                Main.frame.setSize(new LandingPage().getPreferredSize());
                Main.frame.setVisible(true);
            }catch (SocketException | EOFException exception) {
                Main.raiseErrorPage(new ErrorPage(500,exception));
            }catch (Exception exception){
                Main.raiseErrorPage(new ErrorPage(exception));
            }
        });

        // Refresh
        jButton7.addActionListener(e ->{
            try {
                Main.dataOutputStream.writeInt(4);
                applicant = (SerializedApplicant) Main.objectInputStream.readObject();
                renderDetails();
            }catch (SocketException | EOFException exception) {
                Main.raiseErrorPage(new ErrorPage(500,exception));
            }catch (Exception exception){
                Main.raiseErrorPage(new ErrorPage(exception));
            }
        });
    }

    public void renderDetails(){
        status = Main.Status.valueOf(applicant.getStatus());
        jLabel23.setText(applicant.getApplicantId());
        jLabel24.setText(applicant.getFirstName());
        jLabel25.setText(applicant.getLastName());
        jLabel26.setText(applicant.getUniqueId());
        jLabel27.setText(applicant.getEmail());
        jLabel28.setText(applicant.getContact());
        jLabel29.setText(applicant.getEntranceRegNo());
        jLabel30.setText(String.valueOf(applicant.getScore()));
        jLabel31.setText(String.valueOf(applicant.getPercentile()));
        jLabel32.setText(applicant.getHscBoard());
        jLabel33.setText(applicant.getHscRegNo());
        jLabel34.setText(String.valueOf(applicant.getHscPercentage()));
        jLabel35.setText(applicant.getBranchName());
        jLabel36.setText(applicant.getStatus());
        if(!applicant.hasEnrollmentForm())
            jLabel37.setText("Not Issued");
        else if(status == Main.Status.UNDER_VERIFICATION || status == Main.Status.ENROLLED || status== Main.Status.DISQUALIFIED)
            jLabel37.setText("Submitted");
        else
            jLabel37.setText("Not Submitted");
        if(applicant.getEnrollmentId()==null)
            jLabel38.setText("Not Assigned");
        else
            jLabel38.setText(applicant.getEnrollmentId());
        jButton1.setText(String.valueOf(status));
    }
}
