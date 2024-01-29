import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.EOFException;
import java.net.SocketException;
import java.util.LinkedList;
import java.util.List;

public class ClientConversation extends javax.swing.JPanel {

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private DefaultTableModel model;

    private boolean isResolved;
    private String admin;
    private List<String> conversation;

    public ClientConversation() {
        initComponents();
    }

    public ClientConversation(boolean isResolved, String admin, List<String> conversation) {
        this.isResolved = isResolved;
        this.admin = admin;
        this.conversation = conversation;
        initComponents();
        addActionListeners();
        render();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        model = new DefaultTableModel();

        jLabel1.setFont(new java.awt.Font("Ubuntu Mono", 1, 24)); 
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("static/conversation.png")); 
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton1.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); 
        jButton1.setForeground(new Color(13063248));
        jButton1.setText("Leave");

        jButton3.setFont(new java.awt.Font("Dialog", 1, 16)); 
        jButton3.setText("Mark Resolved");

        jTable1.setFont(new java.awt.Font("Dialog", 1, 16)); 
        jTable1.setRowHeight(20);
        jTable1.setTableHeader(null);
        jTable1.setShowGrid(false);
        jTable1.setEnabled(false);
        jTable1.setModel(model);
        model.addColumn("Reply");
        model.addColumn("Message");
        jTable1.setCellSelectionEnabled(false);
        jTable1.getColumnModel().getColumn(0).setCellRenderer(new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                cell.setForeground(Color.GRAY);
                return cell;
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 16)); 
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Admin:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 16)); 
        jLabel3.setForeground(new java.awt.Color(119, 119, 119));
        jLabel3.setText("8888888888888888");

        jTextField1.setFont(new java.awt.Font("Dialog", 1, 16)); 

        jButton2.setFont(new java.awt.Font("Dialog", 1, 16)); 
        jButton2.setText("send");

        jButton4.setFont(new java.awt.Font("Dialog", 1, 16)); 
        jButton4.setText("Refresh");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1238, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(154, 154, 154))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 932, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(43, 43, 43)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(127, Short.MAX_VALUE))
        );
    }

    private void render() {
        for(int i=0;i<24;i++)
            model.insertRow(jTable1.getRowCount(), new Object[]{"", ""});
        jTable1.scrollRectToVisible(jTable1.getCellRect(jTable1.getRowCount()-1, 0, true));

        jLabel3.setText(admin);

        int n = conversation.size();
        for(int i=0;i<n;){
            String message = conversation.get(i++);
            boolean sent = conversation.get(i++).equals("0");
            renderMessage(message,sent);
        }
        if(isResolved){
            jTextField1.setHorizontalAlignment(SwingConstants.CENTER);
            jTextField1.setForeground(Color.GRAY);
            jTextField1.setEditable(false);
            jTextField1.setText("Closed");
            jButton3.setText("Resolved");
            jButton2.setEnabled(false);
            jButton3.setEnabled(false);
        }
    }


    private void addActionListeners(){
        jButton1.addActionListener(e -> {
            try{
                Main.dataOutputStream.writeInt(0);
                Main.frame.getContentPane().removeAll();
                Main.frame.setContentPane(new HelpAndSupport());
                Main.frame.setSize(new HelpAndSupport().getPreferredSize());
                Main.frame.setVisible(true);
            }catch (SocketException | EOFException exception) {
                Main.raiseErrorPage(new ErrorPage(500,exception));
            }catch (Exception exception){
                Main.raiseErrorPage(new ErrorPage(exception));
            }
        });

        jButton2.addActionListener(e -> {
            try{
                String message = jTextField1.getText();
                if(!message.isBlank()) {
                    renderMessage(message, true);
                    Main.dataOutputStream.writeInt(1);
                    Main.dataOutputStream.writeUTF(message);
                    jTextField1.setText("");
                }
            }catch (SocketException | EOFException exception) {
                Main.raiseErrorPage(new ErrorPage(500,exception));
            }catch (Exception exception){
                Main.raiseErrorPage(new ErrorPage(exception));
            }
        });

        jButton3.addActionListener(e -> {
            try{
                Main.dataOutputStream.writeInt(2);
                isResolved = true;
                jTextField1.setHorizontalAlignment(SwingConstants.CENTER);
                jTextField1.setForeground(Color.GRAY);
                jTextField1.setText("Closed");
                jTextField1.setEditable(false);
                jButton3.setText("Resolved");
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
            }catch (SocketException | EOFException exception) {
                Main.raiseErrorPage(new ErrorPage(500,exception));
            }catch (Exception exception){
                Main.raiseErrorPage(new ErrorPage(exception));
            }
        });

        jButton4.addActionListener(e -> {
            try{
                clearChatBox();
                Main.dataOutputStream.writeInt(3);
                admin = Main.dataInputStream.readUTF();
                jLabel3.setText(admin);
                int n = Main.dataInputStream.readInt();
                for(int i=0;i<n;i+=2){
                    String message = Main.dataInputStream.readUTF();
                    boolean sent = Main.dataInputStream.readUTF().equals("0");
                    renderMessage(message,sent);
                }
            }catch (SocketException | EOFException exception) {
                Main.raiseErrorPage(new ErrorPage(500,exception));
            }catch (Exception exception){
                Main.raiseErrorPage(new ErrorPage(exception));
            }
        });
    }

    private void renderMessage(String message,boolean sent){
        model.insertRow(jTable1.getRowCount(),new Object[]{"",""});
        int i = 0, characters=0;
        String breakPoint = "";
        java.util.List<String> words = new LinkedList<>();
        for (String word : message.split(" ")){
            i++;
            if(i < message.split(" ").length)
                words.add(word+" ");
            else
                words.add(word);
        }
        for(String word : words) {
            if(word.length()<=40){
                characters += word.length();
                if (characters > 40){
                    model.insertRow(jTable1.getRowCount(),sent?new Object[]{"",breakPoint}:new Object[]{breakPoint,""});
                    breakPoint = word;
                    characters = word.length();
                }else {
                    breakPoint += word;
                }
            }else{
                if(!breakPoint.isBlank()) {
                    model.insertRow(jTable1.getRowCount(),sent?new Object[]{"",breakPoint}:new Object[]{breakPoint,""});
                    breakPoint = "";
                }
                word = "[ "+word+" ]";
                String part="";
                for(char c : word.toCharArray()){
                    part += String.valueOf(c);
                    if(part.length()>=40) {
                        model.insertRow(jTable1.getRowCount(), sent ? new Object[]{"", part} : new Object[]{part, ""});
                        part = "";
                    }
                }
                if(!part.isBlank())
                    model.insertRow(jTable1.getRowCount(), sent ? new Object[]{"", part} : new Object[]{part, ""});
            }
        }
        if(!breakPoint.isBlank())
            model.insertRow(jTable1.getRowCount(),sent?new Object[]{"",breakPoint}:new Object[]{breakPoint,""});
        
        jTable1.scrollRectToVisible(jTable1.getCellRect(jTable1.getRowCount()-1, 0, true));
    }

    private void clearChatBox(){
        model.setRowCount(0);
        for(int i=0;i<25;i++)
            model.insertRow(0,new Object[]{"",""});
    }
}
