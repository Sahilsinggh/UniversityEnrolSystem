import javax.swing.*;
import java.awt.*;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

public class ErrorPage extends JPanel {

    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JScrollPane jScrollPane1;
    private JTextPane jTextPane1;
    private Map<Integer,String> errorMap = new HashMap<>();

    public ErrorPage(){
        initComponents();
    }
    public ErrorPage(Exception e) {
        initComponents();
        jLabel3.setText("Check console for technical details.");
        StringWriter errors = new StringWriter();
        e.printStackTrace(new PrintWriter(errors));
        jTextPane1.setText(errors.toString());
        jTextPane1.setEditable(false);
    }
    public ErrorPage(int code, Exception e){
        this(e);
        jLabel2.setText(String.valueOf(code));
        jLabel4.setText(errorMap.get(code));
    }
    public ErrorPage(int code){
        initComponents();
        jLabel2.setText(String.valueOf(code));
        jLabel4.setText(errorMap.get(code));
        jTextPane1.setEditable(false);
    }

    private void initComponents() {

        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jScrollPane1 = new JScrollPane();
        jTextPane1 = new JTextPane();

        jLabel1.setIcon(new ImageIcon("static/error_icon.png")); 

        jLabel2.setFont(new Font("Dialog", 1, 36)); 
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setText("Error");
        jLabel2.setToolTipText("");
        jLabel2.setVerticalAlignment(SwingConstants.TOP);

        jLabel3.setFont(new Font("Dialog", 0, 18)); 
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setText("");
        jLabel3.setToolTipText("");
        jLabel3.setVerticalAlignment(SwingConstants.TOP);

        jLabel4.setFont(new Font("Dialog", 1, 24)); 
        jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel4.setText("Oops! Something went wrong.");
        jLabel4.setToolTipText("");
        jLabel4.setVerticalAlignment(SwingConstants.TOP);

        jTextPane1.setFont(new Font("Ubuntu Mono", 1, 18)); 
        jScrollPane1.setViewportView(jTextPane1);

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(572, 572, 572)
                                .addComponent(jLabel1)
                                .addContainerGap(550, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 193, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 882, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 882, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 882, GroupLayout.PREFERRED_SIZE))
                                .addGap(175, 175, 175))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
                                .addGap(510, 510, 510))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel1)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 342, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(88, Short.MAX_VALUE))
        );

        errorMap.put(400,"Bad Request");
        errorMap.put(401,"Unauthorized");
        errorMap.put(403,"Forbidden");
        errorMap.put(404,"Not Found");
        errorMap.put(500,"Internal Server Error");
    }
}

