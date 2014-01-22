import java.net.*;
import java.io.*;

public class UDPClient 
{
	
	public static void main(String[] args) 
	{
		DatagramSocket datagramSocket = null;
		
		try {
			// Create a Datagram Socket and bind it to a local port
			datagramSocket = new DatagramSocket();
			// Place data in byte array
			String data = "Can you hear me?";
			byte [] message = data.getBytes();
			InetAddress host = InetAddress.getByName("localhost");
			int serverPort = 6789;
			// Create a Datagram Packet to send the request to the server
			DatagramPacket request = new DatagramPacket(message, data.length(), host, serverPort);
			// Invoke the send method using the socket with a reference to the request packet
			datagramSocket.send(request);
			// Create a Datagram Packet to get the reply from the server
			byte [] buffer = new byte [1000];
			DatagramPacket reply = new DatagramPacket(buffer, buffer.length);
			// Invoke the receive method using the socket with a reference to the reply packet
			datagramSocket.receive(reply);
			System.out.println("Reply : " + new String(reply.getData()));
			
		} catch (SocketException e) {
			System.out.println("SocketException : " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException : " + e.getMessage());
		} finally {
			// Close the connection
			if(datagramSocket != null)
				datagramSocket.close();
		}
	}

}
