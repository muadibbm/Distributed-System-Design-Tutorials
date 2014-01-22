import java.net.*;
import java.io.*;

public class UDPServer 
{

	public static void main(String[] args) 
	{
		DatagramSocket datagramSocket = null;
		int serverPort = 6789;
		
		try {
			// Create a Datagram Socket and bind it to a local port
			datagramSocket = new DatagramSocket(serverPort);
			byte [] buffer = new byte [1000];
			// Create a Datagram Packet to receive the request from the client
			DatagramPacket request = new DatagramPacket(buffer, buffer.length);
			// Invoke the receive method using the socket with a reference to the request packet
			datagramSocket.receive(request);
			// Create a Datagram Packet to send the reply to the client
			DatagramPacket reply = new DatagramPacket(request.getData(), request.getLength(), request.getAddress(), request.getPort());
			// Invoke the send method using the socket with a reference to the reply packet
			datagramSocket.send(reply);
			
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
