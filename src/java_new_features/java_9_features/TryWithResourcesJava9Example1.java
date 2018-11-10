package java_new_features.java_9_features;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
public class TryWithResourcesJava9Example1 
{
	public static void main(String args[])throws FileNotFoundException
	{
		FileOutputStream fOS=new FileOutputStream("src/java_new_features/java_9_features/Files/TryFile.txt");
		try(fOS)
		{
			String greetings="Welcome here try with resources in Java 9";
			byte b[]=greetings.getBytes();
			fOS.write(b);
			System.out.println("File written");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}