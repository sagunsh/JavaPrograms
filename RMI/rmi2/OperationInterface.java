import java.rmi.*;

public interface OperationInterface extends Remote {
	public int add(int x, int y) throws RemoteException;
	public int sub(int x, int y) throws RemoteException;
}