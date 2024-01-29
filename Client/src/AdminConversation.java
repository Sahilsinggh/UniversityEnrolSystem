import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.EOFException;
import java.net.SocketException;
import java.util.LinkedList;
import java.util.List;

public class AdminConversation extends JPanel {

    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JTable jTable1;
    private JTable jTable2;
    private JTable jTable3;
    private JTextField jTextField1;
    private DefaultTableModel model1;
    private DefaultTableModel model2;
    private DefaultTableModel model3;

    private List<String> tickets;
    private String adminName, clientName;

    public AdminConversation(String adminName, List<String> tickets) {
        this.adminName = adminName;
        this.tickets = tickets;
        initComponents();
        render();
        addActionListeners();
    }

    public AdminConversation() {
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        jScrollPane2 = new JScrollPane();
        jTable2 = new JTable();
        jScrollPane3 = new JScrollPane();
        jTable3 = new JTable();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jTextField1 = new JTextField();
        model1 = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        model2 = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        model3 = new DefaultTableModel();

        jLabel1.setFont(new Font("Ubuntu Mono", 1, 24)); 
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setIcon(new ImageIcon("static/client_support.png")); 
        jLabel1.setBorder(BorderFactory.createEtchedBorder());
        jLabel1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new Font("Dialog", 3, 16)); 
        jLabel2.setForeground(Color.GRAY);
        jLabel2.setText(" ClientName");

        jTable1.setFont(new Font("Ubuntu Mono", 1, 18)); 
        jTable1.setRowHeight(24);
        jTable1.setModel(model1);
        model1.addColumn("Ongoing Tickets");
        for(int i=0;i<15;i++)
        model1.insertRow(0,new Object[]{""});
        jScrollPane1.setViewportView(jTable1);

        jTable2.setFont(new Font("Ubuntu Mono", 1, 18)); 
        jTable2.setRowHeight(24);
        jTable2.setModel(model2);
        model2.addColumn("New Tickets");
        for(int i=0;i<15;i++)
        model2.insertRow(0,new Object[]{""});
        jScrollPane2.setViewportView(jTable2);

        jTable3.setFont(new Font("Dialog", 1, 16)); 
        jTable3.setRowHeight(20);
        jTable3.setTableHeader(null);
        jTable3.setShowGrid(false);
        jTable3.setEnabled(false);
        jTable3.setModel(model3);
        model3.addColumn("Reply");
        model3.addColumn("Message");
        for(int i=0;i<26;i++)
            model3.insertRow(0,new Object[]{"",""});
        jTable3.getColumnModel().getColumn(0).setCellRenderer(new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                cell.setForeground(Color.GRAY);
                return cell;
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jButton1.setFont(new Font("Ubuntu Mono", 1, 18)); 
        jButton1.setForeground(UIManager.getDefaults().getColor("Actions.Red"));
        jButton1.setForeground(new Color(13063248));
        jButton1.setText("Back");

        jButton2.setFont(new Font("Dialog", 1, 16)); 
        jButton2.setText("send");
        jButton2.setEnabled(false);

        jTextField1.setFont(new Font("Dialog", 1, 16)); 
        jTextField1.setEnabled(false);

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 1238, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGap(112, 112, 112)
                                                                .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 932, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jScrollPane3, GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 821, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)))))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 530, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jTextField1)
                                                                        .addComponent(jButton2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)))))
                                .addGap(84, 84, 84))
        );
    }

    private void render(){
        jLabel2.setText(" ");
        DefaultTableModel model = model2;

        for(String ticket: tickets){
            if(ticket.equals("BREAKPOINT"))
                model = model1;
            else
                model.insertRow(0,new Object[]{" "+ticket});
        }
    }

    private void addActionListeners(){
        jTable1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jTable2.clearSelection();
                int row = jTable1.getSelectedRow();
                int col = jTable1.getSelectedColumn();
                String ticketNo = String.valueOf(jTable1.getValueAt(row,col));
                if(!ticketNo.isBlank())
                    renderConversation(ticketNo.substring(1));
            }
        });

        jTable2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jTable1.clearSelection();
                int row = jTable2.getSelectedRow();
                int col = jTable2.getSelectedColumn();
                String ticketNo = String.valueOf(jTable2.getValueAt(row,col));
                if(!ticketNo.isBlank())
                    renderConversation(ticketNo.substring(1));
            }
        });

        jButton1.addActionListener(e -> {
            try{
                Main.dataOutputStream.writeInt(0);
                Main.frame.getContentPane().removeAll();
                Main.frame.setContentPane(new AdminPage(adminName,true));
                Main.frame.setSize(new AdminPage().getPreferredSize());
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
                    Main.dataOutputStream.writeInt(2);
                    Main.dataOutputStream.writeUTF(message);
                    jTextField1.setText("");
                }
            }catch (SocketException | EOFException exception) {
                Main.raiseErrorPage(new ErrorPage(500,exception));
            }catch (Exception exception){
                Main.raiseErrorPage(new ErrorPage(exception));
            }
        });
    }

    private void renderConversation(String ticketNo){
        try{
            clearChatBox();
            Main.dataOutputStream.writeInt(1);
            Main.dataOutputStream.writeUTF(ticketNo);
            clientName = Main.dataInputStream.readUTF();
            jLabel2.setText(clientName);
            int n = Main.dataInputStream.readInt();
            for(int i=0;i<n;i+=2){
                String message = Main.dataInputStream.readUTF();
                boolean sent = Main.dataInputStream.readUTF().equals("1");
                renderMessage(message,sent);
            }
            jButton2.setEnabled(true);
            jTextField1.setEnabled(true);
        }catch (SocketException | EOFException exception) {
            Main.raiseErrorPage(new ErrorPage(500,exception));
        }catch (Exception exception){
            Main.raiseErrorPage(new ErrorPage(exception));
        }
    }

    private void renderMessage(String message,boolean sent){
        model3.insertRow(jTable3.getRowCount(),new Object[]{"",""});
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
                    model3.insertRow(jTable3.getRowCount(),sent?new Object[]{"",breakPoint}:new Object[]{breakPoint,""});
                    breakPoint = word;
                    characters = word.length();
                }else {
                    breakPoint += word;
                }
            }else{
                if(!breakPoint.isBlank()) {
                    model3.insertRow(jTable3.getRowCount(),sent?new Object[]{"",breakPoint}:new Object[]{breakPoint,""});
                    breakPoint = "";
                }
                word = "[ "+word+" ]";
                String part="";
                for(char c : word.toCharArray()){
                    part += String.valueOf(c);
                    if(part.length()>=40) {
                        model3.insertRow(jTable3.getRowCount(), sent ? new Object[]{"", part} : new Object[]{part, ""});
                        part = "";
                    }
                }
                if(!part.isBlank())
                    model3.insertRow(jTable3.getRowCount(), sent ? new Object[]{"", part} : new Object[]{part, ""});
            }
        }
        if(!breakPoint.isBlank())
            model3.insertRow(jTable3.getRowCount(),sent?new Object[]{"",breakPoint}:new Object[]{breakPoint,""});

        jTable3.scrollRectToVisible(jTable3.getCellRect(jTable3.getRowCount()-1, 0, true));
    }

    private void clearChatBox(){
        model3.setRowCount(0);
        for(int i=0;i<26;i++)
            model3.insertRow(0,new Object[]{"",""});
    }
}
