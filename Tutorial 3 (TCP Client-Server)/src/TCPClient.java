import java.net.*;
import java.io.*;

public class TCPClient 
{
	public static void main(String[] args)
	{
		Socket socket = null; // Also known as ClientSocket
		
		PrintWriter out;
		BufferedReader in;
		BufferedReader userInput;
		
		try {
			// Create a Socket and bind it to a port
			int serverPort = 6789;
			InetAddress host = InetAddress.getByName("localhost");
			socket = new Socket(host, serverPort);
			// Create the stream of data to be communicated between this client and the server
			out = new PrintWriter(socket.getOutputStream(), true); 
		    in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		    userInput = new BufferedReader(new InputStreamReader(System.in));
			String line;
			
			System.out.print("> " );
			while((line = userInput.readLine()) != null)
			{
				out.println(line); //sending the line to the server
				System.out.println("Sent \"" + line + "\" to the server");
				System.out.print("> " );
				if(line.equals("exit"))
					break;
			}
			
			out.close();
			in.close();
			userInput.close();
			socket.close();
			
		} catch (UnknownHostException e) {
			System.out.println("UnknownHostException:" + e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException:" + e.getMessage());
		}
	}
}
