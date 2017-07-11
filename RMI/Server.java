import java.rmi.*;

public class Server{
    public static void main(String args[]) {
        try {
            AdderInterface stub = new AdderRemote();
            Naming.rebind("rmi://localhost:1234/sagunsh", stub);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}