import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.EOFException;
import java.net.SocketException;

public class EnrollmentFormDialogBox extends JDialog {

    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JButton jButton8;
    private JButton jButton9;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;

    private String enrollmentForm, entranceMarkSheet, hscMarkSheet;

    public EnrollmentFormDialogBox(Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        addActionListeners();
    }

    private void initComponents() {

        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jTextField3 = new JTextField();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jButton6 = new JButton();
        jButton7 = new JButton();
        jButton8 = new JButton();
        jButton9 = new JButton();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jTextField1.setEditable(false);
        jTextField1.setFont(new Font("Dialog", 1, 14)); 

        jTextField2.setEditable(false);
        jTextField2.setFont(new Font("Dialog", 1, 14)); 

        jTextField3.setEditable(false);
        jTextField3.setFont(new Font("Dialog", 1, 14)); 

        jButton4.setText("Browse");
        jButton5.setText("Clear");
        jButton6.setText("Browse");
        jButton7.setText("Clear");
        jButton8.setText("Browse");
        jButton9.setText("Clear");

        jLabel1.setFont(new Font("Dialog", 0, 16)); 
        jLabel1.setText("Enrollment Form: ");

        jLabel2.setFont(new Font("Dialog", 0, 16)); 
        jLabel2.setText("Entrance Marksheet:");

        jLabel3.setFont(new Font("Dialog", 0, 16)); 
        jLabel3.setText("HSC MarkSheet");

        jButton1.setFont(new Font("Dialog", 1, 16)); 
        jButton1.setText("Download Form");

        jButton2.setFont(new Font("Dialog", 1, 16)); 
        jButton2.setText("Cancel");

        jButton3.setFont(new Font("Dialog", 1, 16)); 
        jButton3.setText("Submit");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton9, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(101, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                                .addGap(272, 272, 272))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                                .addGap(264, 264, 264))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jLabel1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(jButton4)
                                                .addComponent(jButton5)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton6)
                                        .addComponent(jButton7))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton8)
                                        .addComponent(jButton9))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }

    private void addActionListeners(){
        jButton1.addActionListener(e->{
            try {
                Main.dataOutputStream.writeInt(6);
                Main.receiveFile("downloads/EnrollmentForm.pdf");
                dispose();
                String message = "Enrollment Form saved to Downloads/";
                Dialog dialog = new DialogBox(Main.frame,true,message);
                dialog.setLocationRelativeTo(Main.frame);
                dialog.setVisible(true);

            }catch (SocketException | EOFException exception) {
                Main.raiseErrorPage(new ErrorPage(500,exception));
            }catch (Exception exception){
                Main.raiseErrorPage(new ErrorPage(exception));
            }
        });

        jButton2.addActionListener(e->{
            dispose();
        });

        jButton3.addActionListener(e->{
            try {
                if (formIsValid()) {
                    jButton1.setEnabled(false);
                    jButton2.setEnabled(false);
                    jButton3.setEnabled(false);
                    Main.dataOutputStream.writeInt(3);
                    Main.sendFile(enrollmentForm);
                    Main.sendFile(entranceMarkSheet);
                    Main.sendFile(hscMarkSheet);
                    int status = Main.dataInputStream.readInt();
                    dispose();
                    String message="";
                    if(status>=200 && status<=299)
                        message = "Upload Successful";
                    else
                        message = "Upload Failed";
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
            FileNameExtensionFilter filter = new FileNameExtensionFilter("PDF Documents","pdf");
            Main.jFileChooser.setFileFilter(filter);
            if(Main.jFileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
                jTextField1.setText(Main.jFileChooser.getSelectedFile().getAbsolutePath());
        });

        jButton6.addActionListener(e -> {
            FileNameExtensionFilter filter = new FileNameExtensionFilter("PDF Documents","pdf");
            Main.jFileChooser.setFileFilter(filter);
            if(Main.jFileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
                jTextField2.setText(Main.jFileChooser.getSelectedFile().getAbsolutePath());
        });

        jButton8.addActionListener(e -> {
            FileNameExtensionFilter filter = new FileNameExtensionFilter("PDF Documents","pdf");
            Main.jFileChooser.setFileFilter(filter);
            if(Main.jFileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
                jTextField3.setText(Main.jFileChooser.getSelectedFile().getAbsolutePath());
        });

        jButton5.addActionListener(e -> {
            jTextField1.setText("");
        });

        jButton7.addActionListener(e -> {
            jTextField2.setText("");
        });

        jButton9.addActionListener(e -> {
            jTextField3.setText("");
        });

    }

    private boolean formIsValid(){
        boolean flag = true;
        enrollmentForm = jTextField1.getText();
        entranceMarkSheet = jTextField2.getText();
        hscMarkSheet = jTextField3.getText();

        if(enrollmentForm.isBlank()){
            jTextField1.setBorder(BorderFactory.createLineBorder(Color.RED));
            flag = false;
        }else jTextField1.setBorder(null);

        if(entranceMarkSheet.isBlank()){
            jTextField2.setBorder(BorderFactory.createLineBorder(Color.RED));
            flag = false;
        }else jTextField2.setBorder(null);

        if(hscMarkSheet.isBlank()){
            jTextField3.setBorder(BorderFactory.createLineBorder(Color.RED));
            flag = false;
        }else jTextField3.setBorder(null);

        return flag;
    }
}
