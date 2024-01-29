import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.EOFException;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;

public class AdminPage extends JPanel {

    private JButton jButton1;
    private JButton jButton11;
    private JButton jButton12;
    private JButton jButton13;
    private JButton jButton14;
    private JButton jButton15;
    private JButton jButton16;
    private JButton jButton17;
    private JButton jButton18;
    private JButton jButton19;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JComboBox<String> jComboBox1;
    private JTextField jTextField1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JScrollPane jScrollPane1;
    private JSeparator jSeparator1;
    private JSeparator jSeparator2;
    private JSeparator jSeparator3;
    private JTable jTable1;
    private DefaultTableModel model;
    private String name;

    public AdminPage(String name) {
        this.name = name;
        initComponents();
        addActionListeners();
        renderDetails();
    }
    public AdminPage(String name,boolean returning) {
        this.name = name;
        initComponents();
        addActionListeners();
        jButton19.doClick();
    }
    public AdminPage() {
        initComponents();
    }

    private void initComponents() {

        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jSeparator1 = new JSeparator();
        jSeparator2 = new JSeparator();
        jSeparator3 = new JSeparator();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jButton6 = new JButton();
        jButton7 = new JButton();
        jButton11 = new JButton();
        jButton12 = new JButton();
        jButton13 = new JButton();
        jButton14 = new JButton();
        jButton15 = new JButton();
        jButton16 = new JButton();
        jButton17 = new JButton();
        jButton18 = new JButton();
        jButton19 = new JButton();
        jComboBox1 = new JComboBox<>();
        jTextField1 = new JTextField();

        jTable1.setFont(new Font("Ubuntu Mono", 1, 18)); 
        jTable1.setSelectionBackground(null);
        jTable1.setSelectionForeground(null);
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new Font("Ubuntu Mono", 1, 24)); 
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setIcon(new ImageIcon("static/admin_page.png")); 
        jLabel1.setBorder(BorderFactory.createEtchedBorder());
        jLabel1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new Font("Dialog", 1, 18)); 
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setText("Welcome, Admin");

        jLabel3.setFont(new Font("Dialog", 3, 16)); 
        jLabel3.setText("Customization");
        jLabel3.setForeground(Color.GRAY);

        jLabel4.setFont(new Font("Dialog", 3, 16)); 
        jLabel4.setText("Introspection");
        jLabel4.setForeground(Color.GRAY);

        jLabel5.setFont(new Font("Dialog", 3, 16)); 
        jLabel5.setText("Enrollment");
        jLabel5.setForeground(Color.GRAY);

        jSeparator1.setBorder(BorderFactory.createLineBorder(new Color(187, 187, 187)));

        jSeparator2.setBorder(BorderFactory.createLineBorder(new Color(187, 187, 187)));

        jSeparator3.setOrientation(SwingConstants.VERTICAL);
        jSeparator3.setBorder(BorderFactory.createLineBorder(new Color(187, 187, 187)));

        jButton1.setFont(new Font("Dialog", 1, 16)); 
        jButton1.setForeground(new Color(13063248));
        jButton1.setText("Logout");

        jButton2.setFont(new Font("Dialog", 1, 16)); 
        jButton2.setText("Initialize");

        jButton3.setFont(new Font("Dialog", 1, 16)); 
        jButton3.setText("Add Branch");

        jButton4.setFont(new Font("Dialog", 1, 16)); 
        jButton4.setText("Remove Branch");

        jButton5.setFont(new Font("Dialog", 1, 16)); 
        jButton5.setText("Set Enrollmet Form");

        jButton6.setFont(new Font("Dialog", 1, 16)); 
        jButton6.setText("Add Events");

        jButton7.setFont(new Font("Dialog", 1, 16)); 
        jButton7.setText("List Applicants");

        jButton11.setFont(new Font("Dialog", 1, 16)); 
        jButton11.setText("Check Status");

        jButton12.setFont(new Font("Dialog", 1, 16)); 
        jButton12.setText("Shortlist Applicants");

        jButton13.setFont(new Font("Dialog", 1, 16)); 
        jButton13.setText("Issue Forms");

        jButton14.setFont(new Font("Dialog", 1, 16)); 
        jButton14.setText("View Documents");

        jButton15.setFont(new Font("Dialog", 1, 16)); 
        jButton15.setText("Enroll Applicant");

        jButton16.setFont(new Font("Dialog", 1, 16)); 
        jButton16.setText("Mark Disqualified");

        jButton17.setFont(new Font("Dialog", 1, 16)); 
        jButton17.setText("Client Support");

        jButton18.setFont(new Font("Dialog", 1, 16)); 
        jButton18.setText("New Admin");

        jButton19.setFont(new Font("Dialog", 1, 16)); 
        jButton19.setText("Refresh");

        jComboBox1.setFont(new Font("Dialog", 0, 18)); 
        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[] { "ALL", "APPLIED", "SHORTLISTED", "LOCKED", "REJECTED", "FLOATED", "UNDER_VERIFICATION", "ENROLLED", "DISQUALIFIED" }));

        jTextField1.setFont(new Font("Dialog", 1, 16)); 

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                        .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(110, 110, 110)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                                                                .addGap(182, 182, 182)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jButton7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jButton11, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jComboBox1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jTextField1))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jButton16, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jButton15, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jButton14, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jButton12, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jButton13, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addGap(110, 110, 110))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(151, 151, 151)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 751, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jButton19, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton17, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton18, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE))
                                                                .addGap(0, 164, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel3)
                                                                .addGap(289, 289, 289)
                                                                .addComponent(jLabel4)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel5)
                                                                .addGap(161, 161, 161))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jSeparator3)))
                                .addContainerGap())
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(419, 419, 419)
                                        .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(836, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(841, 841, 841)
                                        .addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(414, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton19, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton17, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton18, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton12, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton13, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton14, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton15, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton16, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton11, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 149, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap(345, Short.MAX_VALUE)
                                        .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap()))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap(345, Short.MAX_VALUE)
                                        .addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap()))
        );
    }

    private void renderDetails(){
        model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jTable1.setModel(model);
        model.addColumn("Branch");
        model.addColumn("Seats");
        model.addColumn("Locked");
        model.addColumn("Allocated");
        jLabel2.setText("Welcome, "+name);
        try{
            int n = Main.dataInputStream.readInt()/4;
            for(int i=0;i<n;i++){
                String branch = Main.dataInputStream.readUTF();
                String seats = Main.dataInputStream.readUTF();
                String locked = Main.dataInputStream.readUTF();
                String allocated = Main.dataInputStream.readUTF();
                model.insertRow(i,new Object[]{branch,seats,locked,allocated});
            }
            if(n<9) {
                for (int i = 0; i < 9 - n; i++)
                    model.insertRow(jTable1.getRowCount(), new Object[]{"", "", "", ""});
            }
        }catch (SocketException | EOFException exception) {
            Main.raiseErrorPage(new ErrorPage(500,exception));
        }catch (Exception exception){
            Main.raiseErrorPage(new ErrorPage(exception));
        }
    }


    private void addActionListeners(){
        jButton1.addActionListener(e -> {
            try {
                Main.dataOutputStream.writeInt(0);
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

        jButton2.addActionListener(e -> {
            Dialog dialog = new InitDialogBox(Main.frame,true);
            dialog.setLocationRelativeTo(Main.frame);
            dialog.setVisible(true);
        });

        jButton3.addActionListener(e -> {
            Dialog dialog = new BranchAddDialogBox(Main.frame, true);
            dialog.setLocationRelativeTo(Main.frame);
            dialog.setVisible(true);
        });

        jButton4.addActionListener(e -> {
            Dialog dialog = new BranchRemoveDialogBox(Main.frame,true);
            dialog.setLocationRelativeTo(Main.frame);
            dialog.setVisible(true);
        });

        jButton5.addActionListener(e -> {
            Dialog dialog = new SetFormDialogBox(Main.frame,true);
            dialog.setLocationRelativeTo(Main.frame);
            dialog.setVisible(true);
        });

        jButton6.addActionListener(e -> {
            Dialog dialog = new AddEventDialogBox(Main.frame,true);
            dialog.setLocationRelativeTo(Main.frame);
            dialog.setVisible(true);
        });

        jButton7.addActionListener(e -> {
            try{
                java.util.List<String> result = new ArrayList<>();
                String status = jComboBox1.getSelectedItem().toString();
                Main.dataOutputStream.writeInt(1);
                if(status.equalsIgnoreCase("ALL"))
                    Main.dataOutputStream.writeUTF("%");
                else
                    Main.dataOutputStream.writeUTF(status);
                int n = Main.dataInputStream.readInt();
                for(int i=0;i<n;i++)
                    result.add(Main.dataInputStream.readUTF());

                Dialog dialog = new ListDialogBox(Main.frame,true,status,result);
                dialog.setLocationRelativeTo(Main.frame);
                dialog.setVisible(true);
            }catch (SocketException | EOFException exception) {
                Main.raiseErrorPage(new ErrorPage(500,exception));
            }catch (Exception exception){
                Main.raiseErrorPage(new ErrorPage(exception));
            }
        });

        jButton11.addActionListener(e -> {
            try{
                String id = jTextField1.getText();
                if(id.isBlank()) {
                    jTextField1.setBorder(BorderFactory.createLineBorder(Color.RED));
                }else{
                    jTextField1.setBorder(null);
                    Main.dataOutputStream.writeInt(4);
                    Main.dataOutputStream.writeUTF(id);
                    int status = Main.dataInputStream.readInt();
                    if(status>=200 && status<=299) {
                        SerializedApplicant applicant = (SerializedApplicant) Main.objectInputStream.readObject();
                        Dialog dialog = new ApplicantDialogBox(Main.frame,true,applicant);
                        dialog.setLocationRelativeTo(Main.frame);
                        dialog.setVisible(true);
                    }else {
                        String message = "Applicant ID: "+id+" Not Found";
                        Dialog dialog = new DialogBox(Main.frame,true,message);
                        dialog.setLocationRelativeTo(Main.frame);
                        dialog.setVisible(true);
                    }
                }
            }catch (SocketException | EOFException exception) {
                Main.raiseErrorPage(new ErrorPage(500,exception));
            }catch (Exception exception){
                Main.raiseErrorPage(new ErrorPage(exception));
            }
        });

        jButton12.addActionListener(e -> {
            try {
                jLabel6.setIcon(new ImageIcon("static/preloader_label.gif")); 
                Main.dataOutputStream.writeInt(3);
                Main.dataInputStream.readInt();
                jButton19.doClick();
                jLabel6.setIcon(null);
                String message = "Applicants Shortlisted";
                Dialog dialog = new DialogBox(Main.frame,true,message);
                dialog.setLocationRelativeTo(Main.frame);
                dialog.setVisible(true);
            }catch (SocketException | EOFException exception) {
                Main.raiseErrorPage(new ErrorPage(500,exception));
            }catch (Exception exception){
                Main.raiseErrorPage(new ErrorPage(exception));
            }
        });

        jButton13.addActionListener(e -> {
            try{
                Main.dataOutputStream.writeInt(6);
                Main.dataInputStream.readInt();
                String message = "Issued Enrollment Forms to LOCKED Applicants";
                Dialog dialog = new DialogBox(Main.frame,true,message);
                dialog.setLocationRelativeTo(Main.frame);
                dialog.setVisible(true);
            }catch (SocketException | EOFException exception) {
                Main.raiseErrorPage(new ErrorPage(500,exception));
            }catch (Exception exception){
                Main.raiseErrorPage(new ErrorPage(exception));
            }
        });

        jButton14.addActionListener(e -> {
            try{
                java.util.List<String> result = new ArrayList<>();
                Main.dataOutputStream.writeInt(8);
                int n = Main.dataInputStream.readInt();
                for(int i=0;i<n;i++)
                    result.add(Main.dataInputStream.readUTF());
                Dialog dialog = new DocumentsDialogBox(Main.frame,true,"UNDER_VERIFICATION",result);
                dialog.setLocationRelativeTo(Main.frame);
                dialog.setVisible(true);
            }catch (SocketException | EOFException exception) {
                Main.raiseErrorPage(new ErrorPage(500,exception));
            }catch (Exception exception){
                Main.raiseErrorPage(new ErrorPage(exception));
            }
        });

        jButton15.addActionListener(e -> {
            Dialog dialog = new EnrollApplicantDialogBox(Main.frame,true);
            dialog.setLocationRelativeTo(Main.frame);
            dialog.setVisible(true);
        });

        jButton16.addActionListener(e -> {
            Dialog dialog = new DisqualifyApplicantDialogBox(Main.frame,true);
            dialog.setLocationRelativeTo(Main.frame);
            dialog.setVisible(true);
        });

        jButton17.addActionListener(e -> {
            try{
                Main.dataOutputStream.writeInt(11);
                int n = Main.dataInputStream.readInt();
                List<String> tickets = new ArrayList<>();
                for(int i=0;i<n;i++)
                    tickets.add(Main.dataInputStream.readUTF());

                Main.frame.getContentPane().removeAll();
                Main.frame.setContentPane(new AdminConversation(name,tickets));
                Main.frame.setSize(new AdminConversation().getPreferredSize());
                Main.frame.setVisible(true);
            }catch (SocketException | EOFException exception) {
                Main.raiseErrorPage(new ErrorPage(500,exception));
            }catch (Exception exception){
                Main.raiseErrorPage(new ErrorPage(exception));
            }
        });
        
        jButton18.addActionListener(e -> {
            Dialog dialog = new AdminRegistrationDialogBox(Main.frame,true);
            dialog.setLocationRelativeTo(Main.frame);
            dialog.setVisible(true);
        });

        jButton19.addActionListener(e -> {
            try{
                Main.dataOutputStream.writeInt(7);
                renderDetails();
            }catch (SocketException | EOFException exception) {
                Main.raiseErrorPage(new ErrorPage(500,exception));
            }catch (Exception exception){
                Main.raiseErrorPage(new ErrorPage(exception));
            }
        });
    }
}
