package java_networking.networking;
import java.io.IOException;
import java.net.InetAddress;
public class InetAddressExample
{
	public static void main(String[] args)throws IOException
	{
		InetAddress ip=InetAddress.getByName("www.javatpoint.com");
		System.out.println("Host Name : "+ip.getHostName());
		System.out.println("Ip Address : "+ip.getHostAddress());
	} 	
}