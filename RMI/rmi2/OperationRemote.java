import java.rmi.*;
import java.rmi.server.*;

public class OperationRemote extends UnicastRemoteObject implements OperationInterface {
	OperationRemote() throws RemoteException{
		super();
	}

	public int add(int x, int y){
		return x+y;
	}

	public int sub(int x, int y){
		return x-y;
	}
}