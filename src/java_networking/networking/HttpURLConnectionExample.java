package java_networking.networking;
import java.io.IOException;
import java.net.URL;
import java.net.HttpURLConnection;
public class HttpURLConnectionExample
{
	public static void main(String[] args)throws IOException
	{
		URL url=new URL("http://www.javatpoint.com/java-tutorial");
	    HttpURLConnection httpurlcon=(HttpURLConnection)url.openConnection();
	    for(int i=1;i<=8;i++)
	    {
	    	System.out.println(httpurlcon.getHeaderFieldKey(i)+"="+httpurlcon.getHeaderField(i));
	    }
	    httpurlcon.disconnect();
	} 	
}