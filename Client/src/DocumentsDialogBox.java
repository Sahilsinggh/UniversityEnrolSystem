import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.net.SocketException;

public class DocumentsDialogBox extends JDialog {

    private JLabel jLabel2;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private String status;
    private DefaultTableModel model;
    private java.util.List<String> result;

    public DocumentsDialogBox(Frame parent, boolean modal, String status, java.util.List<String> result) {
        super(parent, modal);
        this.status = status;
        this.result = result;
        initComponents();
        render();
        addActionListeners();
    }

    private void initComponents() {

        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        jLabel2 = new JLabel();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setFont(new Font("Ubuntu Mono", 1, 18)); 
        jTable1.setSelectionBackground(null);
        jTable1.setSelectionForeground(null);
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new Font("Dialog", 1, 16)); 
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setText("STATUS");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, 1243, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane1)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
                                .addContainerGap())
        );
        pack();
    }

    private void render(){
        jLabel2.setText(status);
        model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jTable1.setModel(model);
        model.addColumn("Applicant ID");
        model.addColumn("Enrollment Form");
        model.addColumn("Entrance MarkSheet");
        model.addColumn("HSC MarkSheet");

            for(int i=0;i<result.size();i++){
                String id = result.get(i);
                model.insertRow(i,new Object[]{id,"","",""});
            }
    }

    private void addActionListeners(){
        jTable1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = jTable1.rowAtPoint(e.getPoint());
                int col = jTable1.columnAtPoint(e.getPoint());
                String id = (String) jTable1.getValueAt(row,0);
                if(col == 1)
                    getFile(id,"_form.pdf");
                else if(col == 2)
                    getFile(id,"_entrance.pdf");
                else if(col == 3)
                    getFile(id,"_hsc.pdf");
            }
        });
    }

    private void getFile(String applicantId,String suffix){
        try{
            Main.dataOutputStream.writeInt(2);
            Main.dataOutputStream.writeUTF(applicantId+suffix);
            int status = Main.dataInputStream.readInt();
            if(status>=200 && status<=299){
                // read extension
                Main.dataInputStream.readUTF();
                Main.receiveFile("downloads/"+applicantId+suffix);
                if (Desktop.isDesktopSupported()) {
                    try {
                        File myFile = new File( "downloads/"+applicantId+suffix);
                        Desktop.getDesktop().open(myFile);
                    } catch (IOException ex) {
                        String message = "Saved to downloads/"+applicantId+suffix;
                        Dialog dialog = new DialogBox(Main.frame,true,message);
                        dialog.setLocationRelativeTo(Main.frame);
                        dialog.setVisible(true);
                    }
                }
            }else{
                String message = "Not Found";
                if(suffix.equalsIgnoreCase("_form.pdf"))
                    message = "Enrollment Form for "+applicantId+" Not Found";
                else if (suffix.equalsIgnoreCase("_entrance.pdf"))
                    message = "Entrance MarkSheet for "+applicantId+" Not Found";
                else if(suffix.equalsIgnoreCase("_hsc.pdf"))
                    message = "HSC MarkSheet for "+applicantId+" Not Found";
                Dialog dialog = new DialogBox(Main.frame,true,message);
                dialog.setLocationRelativeTo(Main.frame);
                dialog.setVisible(true);
            }
        }catch (SocketException | EOFException exception) {
            Main.raiseErrorPage(new ErrorPage(500,exception));
        }catch (Exception exception){
            Main.raiseErrorPage(new ErrorPage(exception));
        }
    }
}
