import java.net.*;
import java.io.*;

public class TCPServer extends Thread {
    private ServerSocket serverSocket;
    public static int i;

    public TCPServer(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        serverSocket.setSoTimeout(10000);
        i=1;
    }

    public void run() {
        while (true) {
            try {
                Socket server = serverSocket.accept();

                DataInputStream in = new DataInputStream(server.getInputStream());
                System.out.println("Client " + i +" says " + in.readUTF());
                i++;

                DataOutputStream out = new DataOutputStream(server.getOutputStream());
                out.writeUTF("Hi Client");
                server.close();
            } catch (Exception e) {
                System.out.println("Exception: " + e);
            }
        }
    }

    public static void main(String [] args) throws Exception{
        int port = 6066;
        Thread t = new TCPServer(port);
        t.start();
    }
}