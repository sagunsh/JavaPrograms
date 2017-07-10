import java.net.*;

public class UrlClass {
    public static void main(String[] args) throws Exception{
        URL url = new URL(
                "https://docs.oracle.com/javase/tutorial/networking/overview/networking.html");
        System.out.println("Protocol = " + url.getProtocol());
        System.out.println("Host name = " + url.getHost());
        System.out.println("File = " + url.getFile());
    }
}
