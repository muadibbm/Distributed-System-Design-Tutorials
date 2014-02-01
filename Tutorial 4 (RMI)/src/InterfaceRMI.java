import java.rmi.*;

public interface InterfaceRMI extends Remote 
{
	public String method(String name) throws java.rmi.RemoteException;
}
