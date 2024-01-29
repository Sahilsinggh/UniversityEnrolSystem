import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ListDialogBox extends JDialog {

    private JLabel jLabel2;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private String status;
    private DefaultTableModel model;
    private java.util.List<String> result;

    public ListDialogBox(Frame parent, boolean modal, String status, java.util.List<String> result) {
        super(parent, modal);
        this.status = status;
        this.result = result;
        initComponents();
        render();
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
        model.addColumn("Name");
        model.addColumn("Email");
        model.addColumn("Phone");
        model.addColumn("Branch");
        model.addColumn("Reg No.");
        model.addColumn("Score");

            for(int i=0,j=0;j<result.size();i++){
                String id = result.get(j++);
                String name = result.get(j++);
                String email = result.get(j++);
                String phone = result.get(j++);
                String branch = result.get(j++);
                String regNo = result.get(j++);
                String score = result.get(j++);
                model.insertRow(i,new Object[]{id,name,email,phone,branch,regNo,score});
            }
    }
}
