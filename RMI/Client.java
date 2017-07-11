import java.rmi.*;

public class Client{
    public static void main(String args[]) {
        try {
            AdderInterface stub = (AdderInterface) Naming.lookup("rmi://localhost:1234/sagunsh");
            System.out.println(stub.add(103,51));
        } catch(Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}