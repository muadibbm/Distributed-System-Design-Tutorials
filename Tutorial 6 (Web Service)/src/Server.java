
public class Server 
{
	public Server()
	{
		System.out.println("Server initialized");
	}
	
	public synchronized String method(int pValue)
	{
		return "Parameter given to method is " + pValue;
	}
}