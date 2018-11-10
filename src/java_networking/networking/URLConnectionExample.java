package java_networking.networking;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
public class URLConnectionExample
{
	public static void main(String[] args)throws IOException
	{
		///* For http Printing Source Code
		URL url=new URL("http://www.javatpoint.com/java-tutorial");
	    URLConnection urlcon=url.openConnection();
	    InputStream	is=urlcon.getInputStream();
	    int i;
	    while((i=is.read())!=-1)
	    {
	    	System.out.print((char)i);
	    }
        //*/

        /* For https Printing Source Code
	    URL url=new URL("https://www.javatpoint.com/java-tutorial");
	    URLConnection urlcon=url.openConnection();
	    InputStream	is=urlcon.getInputStream();
	    int i;
	    while((i=is.read())!=-1)
	    {
	    	System.out.print((char)i);
	    }
	    //*/
	} 	
}