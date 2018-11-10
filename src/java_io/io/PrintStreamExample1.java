package java_io.io;
import java.io.IOException;
import java.io.PrintStream;
import java.io.FileOutputStream;
public class PrintStreamExample1
{
	public static void main(String args[])throws IOException
	{
		FileOutputStream fout=new FileOutputStream("src/java_io/io/Java IO Files/testout10.txt");
		PrintStream ps=new PrintStream(fout);
		ps.println(8912);
		ps.println("Hello I am Nikita Bhosle.");
		ps.println("I Love Swimming.");
		ps.close();
		fout.flush();
		fout.close();
		System.out.println("Success...");
	}
}
