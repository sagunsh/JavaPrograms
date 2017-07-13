import java.rmi.*;

public class Client {
	public static void main(String[] args){
		try {
			OperationInterface stub = (OperationInterface) Naming.lookup("rmi://localhost:1234/aadesh");
			System.out.println("Addition: ");
			System.out.println(stub.add(100,200));
			System.out.println("Subtraction: ");
			System.out.println(stub.sub(200,100));

		} catch (Exception e){
			System.out.println(e);
		}
	}
}