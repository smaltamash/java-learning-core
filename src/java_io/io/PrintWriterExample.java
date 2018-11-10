package java_io.io;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
public class PrintWriterExample
{
	public static void main(String args[])throws IOException
	{
		//Data to write on console using PrintWriter
		PrintWriter pw=new PrintWriter(System.out);
		pw.write("This is my Country.");
		pw.flush();
		pw.close();
		//Data to write in file using PrintWriter
		PrintWriter pw1=null;
		pw1=new PrintWriter(new File("src/java_io/io/Java IO Files/testout11.txt"));
		pw1.write("I am Sheetal and i love Pizza.");
		pw1.flush();
		pw1.close();
		System.out.println("Success...");
	} 
}
