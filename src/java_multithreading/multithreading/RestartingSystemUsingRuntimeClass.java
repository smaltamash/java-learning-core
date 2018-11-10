package java_multithreading.multithreading;
import java.io.IOException;
public class  RestartingSystemUsingRuntimeClass
{
	public static void main(String[]args) throws IOException
	{
		Runtime.getRuntime().exec("shutdown -r now"); //this will restart the System with time delay 0 minutes 
	    //Runtime.getRuntime().exec("shutdown -r 1"); //this will restart the System with time delay 1 minute
	}
}