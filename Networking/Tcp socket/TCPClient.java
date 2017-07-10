import java.net.*;
import java.io.*;

public class TCPClient {

    public static void main(String [] args) throws Exception{
        String serverName = "127.0.0.1";
        int port = 6066;
        Socket client = new Socket(serverName, port);

        OutputStream outToServer = client.getOutputStream();
        DataOutputStream out = new DataOutputStream(outToServer);

        out.writeUTF("Hello server");
        InputStream inFromServer = client.getInputStream();
        DataInputStream in = new DataInputStream(inFromServer);

        System.out.println("Server says " + in.readUTF());
        client.close();

    }
}