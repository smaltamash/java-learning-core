package java_networking.networking;
//DSender.java
import java.io.IOException;
import java.net.InetAddress;
import java.net.DatagramSocket;
import java.net.DatagramPacket;
public class DSender //UDPClient
{
	public static void main(String[] args)throws IOException
	{
		DatagramSocket ds=new DatagramSocket();
		String str="Welcome Java";
		InetAddress ip=InetAddress.getByName("127.0.0.1");
		DatagramPacket dp=new DatagramPacket(str.getBytes(),str.length(),ip,3000);
		ds.send(dp);
		ds.close();
	}
}
