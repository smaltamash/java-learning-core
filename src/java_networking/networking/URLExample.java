package java_networking.networking;
import java.io.IOException;  
import java.net.URL;
public class URLExample
{
	public static void main(String[] args)throws IOException
	{
		URL url=new URL("http://www.javatpoint.com/java-tutorial");
	    System.out.println("Protocol : "+url.getProtocol());
	    System.out.println("Host Name : "+url.getHost());
	    System.out.println("Port Number : "+url.getPort());
	    System.out.println("File Name : "+url.getFile());
	} 	
}