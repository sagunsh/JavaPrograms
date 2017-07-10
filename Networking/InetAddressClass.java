import java.net.*;

public class InetAddressClass {
    public static void main(String[] args) throws Exception{
        InetAddress inetAddress = InetAddress.getByName("www.google.com");
        System.out.println("Host name = " + inetAddress.getHostName());
        System.out.println("IP address = " + inetAddress.getHostAddress());
    }
}
