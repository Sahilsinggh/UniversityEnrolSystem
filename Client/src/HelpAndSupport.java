import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.io.EOFException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HelpAndSupport extends JPanel {

    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JLabel jLabelMessage1;
    private JLabel jLabelMessage2;
    private ButtonGroup buttonGroup1;
    private JRadioButton jRadioButton1;
    private JRadioButton jRadioButton2;
    private JSeparator jSeparator1;
    private JTextField jTextField1;
    private JTextField jTextField2;

    private boolean isRegistered;
    private String client;

    public HelpAndSupport() {
        initComponents();
        addActionListeners();
    }

    private void initComponents() {

        buttonGroup1 = new ButtonGroup();
        jLabel1 = new JLabel();
        jButton1 = new JButton();
        jSeparator1 = new JSeparator();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jRadioButton1 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        jLabel5 = new JLabel();
        jTextField1 = new JTextField();
        jLabelMessage1 = new JLabel();
        jButton2 = new JButton();
        jTextField2 = new JTextField();
        jLabel6 = new JLabel();
        jLabelMessage2 = new JLabel();
        jButton3 = new JButton();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();

        jLabel1.setFont(new Font("Ubuntu Mono", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setIcon(new ImageIcon("static/help_and_support.png")); // NOI18N
        jLabel1.setBorder(BorderFactory.createEtchedBorder());
        jLabel1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

        jButton1.setFont(new Font("Ubuntu Mono", 1, 18)); // NOI18N
        jButton1.setForeground(UIManager.getDefaults().getColor("Actions.Red"));
        jButton1.setForeground(new Color(13063248));
        jButton1.setText("Back");

        jSeparator1.setBorder(BorderFactory.createLineBorder(new Color(187, 187, 187)));

        jLabel2.setFont(new Font("Dialog", 3, 18)); // NOI18N
        jLabel2.setForeground(new Color(136, 136, 136));
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setText("Raise New Ticket");

        jLabel3.setFont(new Font("Dialog", 3, 18)); // NOI18N
        jLabel3.setForeground(new Color(153, 153, 153));
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setText("Existing Ticket");

        jLabel4.setFont(new Font("Dialog", 1, 16)); // NOI18N
        jLabel4.setText("Registered Applicant?");

        jRadioButton1.setText("Yes");

        jRadioButton2.setText("No");
        jRadioButton2.setSelected(true);
        isRegistered = false;

        jLabel5.setFont(new Font("Dialog", 1, 16)); // NOI18N
        jLabel5.setText("Name:");

        jTextField1.setFont(new Font("Ubuntu Mono", 1, 18)); // NOI18N

        jLabelMessage1.setFont(new Font("Dialog", 3, 16)); // NOI18N
        jLabelMessage1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelMessage1.setForeground(Color.GRAY);
        jLabelMessage1.setText(" ");

        jButton2.setFont(new Font("Dialog", 1, 16)); // NOI18N
        jButton2.setText("Continue");

        jTextField2.setFont(new Font("Ubuntu Mono", 1, 18)); // NOI18N

        jLabel6.setFont(new Font("Dialog", 1, 16)); // NOI18N
        jLabel6.setText("Ticket No:");

        jLabel7.setFont(new Font("Dialog", 3, 16)); // NOI18N
        jLabel7.setForeground(new Color(153, 153, 153));
        jLabel7.setText("Quick Support");

        jLabel8.setFont(new Font("Dialog", 3, 16)); // NOI18N
        jLabel8.setForeground(new Color(153, 153, 153));
        jLabel8.setText("Email: "+Main.email);

        jLabel9.setFont(new Font("Dialog", 3, 16)); // NOI18N
        jLabel9.setForeground(new Color(153, 153, 153));
        jLabel9.setText("Contact: +91 "+Main.contact);

        jLabelMessage2.setFont(new Font("Dialog", 3, 16)); // NOI18N
        jLabelMessage2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelMessage2.setForeground(Color.GRAY);
        jLabelMessage2.setText(" ");

        jButton3.setFont(new Font("Dialog", 1, 16)); // NOI18N
        jButton3.setText("Create");

        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jRadioButton1, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jRadioButton2, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 335, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(282, 282, 282)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 335, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel6))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                                                .addGap(254, 254, 254))))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 605, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 605, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelMessage1, GroupLayout.PREFERRED_SIZE, 605, GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(484, 484, 484))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 560, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 560, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(256, 256, 256)
                                                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabelMessage2, GroupLayout.PREFERRED_SIZE, 605, GroupLayout.PREFERRED_SIZE)))
                                .addGap(21, 21, 21))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(625, 625, 625)
                                        .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(625, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                                .addGap(25, 25, 25)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jRadioButton1)
                                                        .addComponent(jRadioButton2))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel5))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(58, 58, 58)
                                                .addComponent(jLabel6)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelMessage2))
                                .addGap(18, 18, 18)
                                .addComponent(jLabelMessage1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addGap(92, 92, 92))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(110, 110, 110)
                                        .addComponent(jSeparator1, GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                                        .addContainerGap()))
        );
    }

    private void addActionListeners(){
        jRadioButton1.addActionListener(e -> {
            jLabel5.setText("Applicant ID:");
            jTextField2.setToolTipText("Registered Applicant ID");
            isRegistered = true;
        });

        jRadioButton2.addActionListener(e -> {
            jLabel5.setText("Name:");
            jTextField2.setToolTipText("eg: John Doe");
            isRegistered = false;
        });

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
            try {
                String ticketNo = jTextField1.getText();
                if(ticketNo.isBlank()){
                    jLabelMessage2.setText("Invalid Format for Ticket No");
                }else {
                    Main.dataOutputStream.writeInt(2);
                    Main.dataOutputStream.writeUTF(ticketNo);
                    int status = Main.dataInputStream.readInt();
                    if(status>=200 && status<=299){
                        boolean isResolved = Main.dataInputStream.readBoolean();
                        String admin = Main.dataInputStream.readUTF();
                        int n = Main.dataInputStream.readInt();
                        List<String> conversation = new ArrayList<>();
                        for(int i=0;i<n;i++)
                            conversation.add(Main.dataInputStream.readUTF());

                        Main.frame.getContentPane().removeAll();
                        Main.frame.setContentPane(new ClientConversation(isResolved,admin,conversation));
                        Main.frame.setSize(new ClientConversation().getPreferredSize());
                        Main.frame.setVisible(true);
                    }else jLabelMessage2.setText("Invalid Ticket No");
                }
            }catch (SocketException | EOFException exception) {
                Main.raiseErrorPage(new ErrorPage(500,exception));
            }catch (Exception exception){
                Main.raiseErrorPage(new ErrorPage(exception));
            }
        });

        jButton3.addActionListener(e -> {
            try{
                if(formIsValid()){
                    Main.dataOutputStream.writeInt(1);
                    Main.dataOutputStream.writeBoolean(isRegistered);
                    Main.dataOutputStream.writeUTF(client);
                    if(isRegistered){
                        int status = Main.dataInputStream.readInt();
                        if(status>=200 && status<=299){
                            String ticketNo = Main.dataInputStream.readUTF();
                            saveTicket(ticketNo);
                            Dialog dialog = new TicketGenerationDialogBox(Main.frame,true,ticketNo);
                            dialog.setLocationRelativeTo(Main.frame);
                            dialog.setVisible(true);
                        }else{
                            jLabelMessage1.setText("Invalid Applicant ID");
                        }
                    }else {
                        String ticketNo = Main.dataInputStream.readUTF();
                        saveTicket(ticketNo);
                        Dialog dialog = new TicketGenerationDialogBox(Main.frame,true,ticketNo);
                        dialog.setLocationRelativeTo(Main.frame);
                        dialog.setVisible(true);
                    }
                }else {
                    if(isRegistered)
                        jLabelMessage1.setText("Invalid Format for Applicant ID");
                    else
                        jLabelMessage1.setText("Invalid Format for Name");
                }
            }catch (SocketException | EOFException exception) {
                Main.raiseErrorPage(new ErrorPage(500,exception));
            }catch (Exception exception){
                Main.raiseErrorPage(new ErrorPage(exception));
            }
        });

        jTextField2.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                jLabelMessage1.setText(" ");
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                jLabelMessage1.setText(" ");
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                jLabelMessage1.setText(" ");
            }
        });

        jTextField1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                jLabelMessage2.setText(" ");
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                jLabelMessage2.setText(" ");
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                jLabelMessage2.setText(" ");
            }
        });

    }

    private boolean formIsValid(){
        boolean flag = true;
        client = jTextField2.getText();
        if(isRegistered){
            if(Validators.isAlNum(client)){
                jTextField2.setBorder(null);
            }else {
                jTextField2.setBorder(BorderFactory.createLineBorder(Color.RED));
                flag = false;
            }
        }else {
            if(Validators.isName(client)){
                jTextField2.setBorder(null);
            }else {
                jTextField2.setBorder(BorderFactory.createLineBorder(Color.RED));
                flag = false;
            }
        }
        return flag;
    }

    private void saveTicket(String ticketNo){
        try(FileWriter file = new FileWriter("downloads/tickets.txt", true)){
            Date date = new Date();
            file.write(date+":\t"+ticketNo+"\t"+client+"\n");
        }catch (IOException e){
            System.out.println("Ticket No: "+ticketNo);
        }
    }
}
