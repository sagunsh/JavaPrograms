import java.rmi.*;

public class Server{
	public  static void main(String[] args){
		try{
			OperationInterface stub = new OperationRemote();
			Naming.rebind("rmi://localhost:1234/aadesh", stub);
		} catch (Exception e){
			System.out.println(e);
		}
	}
}