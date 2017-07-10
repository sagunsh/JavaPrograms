import java.net.*;

public class UDPReceiver{
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(3000);
        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer, 1024);
        socket.receive(packet);
        String str = new String(packet.getData(), 0, packet.getLength());
        System.out.println("Received packet: " + str);
        socket.close();
    }
}