package java_multithreading.multithreading;
import java.io.IOException;
public class  ShuttingDownSystemUsingRuntimeClass
{
	public static void main(String[]args) throws IOException
	{
		Runtime.getRuntime().exec("shutdown -h now"); //this will shutdown the System with time delay 0 minutes 
	    //Runtime.getRuntime().exec("shutdown -h 1"); //this will shutdown the System with time delay 1 minute
	}
}