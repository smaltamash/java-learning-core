package java_networking.networking;
import java.io.IOException;
import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class MyServer //TCPServer
{
	public static void main(String[] args)throws IOException
	{
		ServerSocket ss=new ServerSocket(6666);
		Socket s=ss.accept(); //Establish Connection
		DataInputStream dis=new DataInputStream(s.getInputStream());
		String str=(String)dis.readUTF();	
		System.out.println("Message = "+str);
		ss.close();
	}
}