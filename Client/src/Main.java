import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.Socket;
import java.net.SocketException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    protected static Scanner scanner = new Scanner(System.in);
    protected static JFrame frame = new JFrame();
    protected static JFileChooser jFileChooser = new JFileChooser();
    protected static DataOutputStream dataOutputStream = null;
    protected static DataInputStream dataInputStream = null;
    protected static ObjectOutputStream objectOutputStream = null;
    protected static ObjectInputStream objectInputStream = null;

    protected static HashSet<String> branches;
    protected static String entrance,email,contact;
    protected static double maxMarks;
    protected static List<String> events;

    static {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            System.out.println(UIManager.getSystemLookAndFeelClassName());
        }catch (Exception e){
            System.out.println("Using: CrossPlatformLookAndFeel");
        }
        frame.setResizable(false);
        frame.setTitle("Enrollment System");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon(new ImageIcon("static/logo.png").getImage().getScaledInstance(512,512, Image.SCALE_SMOOTH));
        frame.setIconImage(icon.getImage());
        jFileChooser.setAcceptAllFileFilterUsed(false);
    }

    public static void main(String[] args) throws Exception {
        try(Socket socket = new Socket("localhost",5000)){
            dataOutputStream = new DataOutputStream(socket.getOutputStream());
            dataInputStream = new DataInputStream(socket.getInputStream());
            objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            objectInputStream = new ObjectInputStream(socket.getInputStream());
            acceptDetails();
            frame.setContentPane(new LandingPage());
            frame.setSize(new LandingPage().getPreferredSize());
            frame.setVisible(true);

            scanner.nextLine();
        }catch (SocketException | EOFException e) {
            Main.raiseErrorPage(new ErrorPage(500,e));
        }catch (Exception e){
            Main.raiseErrorPage(new ErrorPage(e));
        }
    }

    public static void raiseErrorPage(ErrorPage errorPage){
        frame.getContentPane().removeAll();
        frame.setContentPane(errorPage);
        frame.setSize(errorPage.getPreferredSize());
        frame.setVisible(true);
    }

    public static void acceptDetails() throws Exception{
        email = dataInputStream.readUTF();
        contact = dataInputStream.readUTF();
        entrance = dataInputStream.readUTF();
        maxMarks = dataInputStream.readDouble();

        int n = dataInputStream.readInt();
        branches = new HashSet<>();
        for(int i=0;i<n;i++)
            branches.add(dataInputStream.readUTF());

        n = dataInputStream.readInt();
        events = new ArrayList<>();
        for(int i=0;i<n;i++)
            events.add(dataInputStream.readUTF());

        receiveFile("static/banner.png");
    }

    public static void sendFile(String path) throws Exception{
        int bytes = 0;
        File file = new File(path);
        FileInputStream fileInputStream = new FileInputStream(file);

        dataOutputStream.writeLong(file.length());
        byte[] buffer = new byte[4*1024];
        while ((bytes=fileInputStream.read(buffer))!=-1){
            dataOutputStream.write(buffer,0,bytes);
            dataOutputStream.flush();
        }
        fileInputStream.close();
    }

    public static String findFile(String dir, String glob){
        try(
            DirectoryStream<Path> dirStream = Files.newDirectoryStream(Paths.get(dir), glob)
        ){
            return dirStream.iterator().next().toAbsolutePath().toString();
        }catch (Exception e){
            return null;
        }
    }

    public static void receiveFile(String fileName) throws Exception{
        int bytes = 0;
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);

        long size = dataInputStream.readLong();
        byte[] buffer = new byte[4*1024];
        while (size > 0 && (bytes = dataInputStream.read(buffer, 0, (int)Math.min(buffer.length, size))) != -1) {
            fileOutputStream.write(buffer,0,bytes);
            size -= bytes;
        }
        fileOutputStream.close();
    }

    public static enum Status{
        PENDING,
        APPLIED,
        SHORTLISTED,
        LOCKED,
        REJECTED,
        FLOATED,
        UNDER_VERIFICATION,
        ENROLLED,
        NOT_FOUND,
        DISQUALIFIED
    }
}
