package java_io.io;
import java.io.IOException;
import java.io.File;
public class FileExample1
{
	public static void main(String args[])throws IOException
	{
		File file=new File("src/java_io/io/Java IO Files/javaFile123.txt");
		if(file.createNewFile())
		{
			System.out.println("New File is created!");
		}
		else
		{
			System.out.println("File already Exists.");
		}
	} 
}
