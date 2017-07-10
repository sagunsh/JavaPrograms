import java.net.*;

public class UDPSender{
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        String packet = "UDP Packet";
        InetAddress ip = InetAddress.getByName("localhost");

        DatagramPacket datagramPacket =
                new DatagramPacket(packet.getBytes(), packet.length(), ip, 3000);

        socket.send(datagramPacket);
        socket.close();

        System.out.println("Packet Sent");
    }
}