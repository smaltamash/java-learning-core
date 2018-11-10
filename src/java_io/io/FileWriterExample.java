package java_io.io;
import java.io.IOException;
import java.io.FileWriter;
public class FileWriterExample
{
	public static void main(String args[])throws IOException
	{
		FileWriter fw=new FileWriter("src/java_io/io/Java IO Files/testout8.txt");
		String content="I am Sonia Aggarwal.";
		fw.write(content);
		fw.close();
		System.out.println("Done");
	}
}
