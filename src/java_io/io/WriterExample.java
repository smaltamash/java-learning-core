package java_io.io;
import java.io.IOException;
import java.io.Writer;
import java.io.FileWriter;
public class WriterExample
{
	public static void main(String args[])throws IOException
	{
		Writer w=new FileWriter("src/java_io/io/Java IO Files/testout7.txt");
		String content="I am Kajal, I love playing Basketball.";
		w.write(content);
		w.close();
		System.out.println("Done");
	}
}
