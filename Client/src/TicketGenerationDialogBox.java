import javax.swing.*;
import java.awt.*;
import java.io.EOFException;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;

public class TicketGenerationDialogBox extends JDialog {

    private JButton jButton1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private String ticketNo;

    public TicketGenerationDialogBox(Frame parent, boolean modal, String ticketNo) {
        super(parent, modal);
        this.ticketNo = ticketNo;
        initComponents();
        addActionListeners();
    }

    private void initComponents() {

        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jButton1 = new JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new Font("Dialog", 1, 16)); 
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setText("Ticket No: "+ticketNo);

        jLabel3.setFont(new Font("Dialog", 0, 16)); 
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setText("Save your Ticket No. for further referencing");

        jButton1.setFont(new Font("Dialog", 1, 16)); 
        jButton1.setText("OK");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                                        .addComponent(jLabel3, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(212, 212, 212)
                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel2)
                                .addGap(19, 19, 19)
                                .addComponent(jLabel3)
                                .addGap(46, 46, 46)
                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
    }

    private void addActionListeners(){
        jButton1.addActionListener(e->{
            dispose();
        });
    }

    @Override
    public void dispose() {
        try {
            boolean isResolved = Main.dataInputStream.readBoolean();
            String admin = Main.dataInputStream.readUTF();
            int n = Main.dataInputStream.readInt();
            List<String> conversation = new ArrayList<>();
            for (int i = 0; i < n; i++)
                conversation.add(Main.dataInputStream.readUTF());

            Main.frame.getContentPane().removeAll();
            Main.frame.setContentPane(new ClientConversation(isResolved, admin, conversation));
            Main.frame.setSize(new ClientConversation().getPreferredSize());
            Main.frame.setVisible(true);
        }catch (SocketException | EOFException exception) {
            Main.raiseErrorPage(new ErrorPage(500,exception));
        }catch (Exception exception){
            Main.raiseErrorPage(new ErrorPage(exception));
        }finally {
            super.dispose();
        }
    }
}
