import java.rmi.*;

public interface AdderInterface extends Remote {
    public int add(int x, int y)throws RemoteException;
}