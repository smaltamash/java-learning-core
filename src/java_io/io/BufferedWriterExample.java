package java_io.io;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
public class BufferedWriterExample
{
	public static void main(String args[])throws IOException
	{
		FileWriter fw=new FileWriter("src/java_io/io/Java IO Files/testout9.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("I am Mahira Shamsi.");
		bw.close();
		System.out.println("Done");
	}
}
