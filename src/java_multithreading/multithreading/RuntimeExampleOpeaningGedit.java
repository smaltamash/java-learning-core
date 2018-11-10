package java_multithreading.multithreading;
import java.io.IOException;
public class  RuntimeExampleOpeaningGedit
{
	public static void main(String[]args) throws IOException
	{
		Runtime.getRuntime().exec("gedit"); //this will open a new gedit
	}
}