import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;


public class ServerRMI implements InterfaceRMI
{
	public static int port = 6789;
			
	@Override
	public String method(String name) throws RemoteException 
	{
		return "Method called with parameter : " + name;
	}
	
	public void registerRemoteObject()
	{
		try {
			Remote remoteObj = UnicastRemoteObject.exportObject(this, port);
			Registry registry = LocateRegistry.createRegistry(port);
			registry.bind("RemoteObj", remoteObj);
			System.out.println("Remote Object registered into RMIRegistry");
		} catch (RemoteException e) {
			System.out.println("RemoteException: " + e.getMessage());
		} catch (AlreadyBoundException e) {
			System.out.println("AlreadyBoundException: " + e.getMessage());
		}
	}
	
	public static void main(String[] args) 
	{
		new ServerRMI().registerRemoteObject();
	}
}
