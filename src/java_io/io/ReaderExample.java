package java_io.io;
import java.io.IOException;
import java.io.Reader;
import java.io.FileReader;
public class ReaderExample
{
	public static void main(String args[])throws IOException
	{
		Reader r=new FileReader("/home/auzad/Desktop/Java IO Files/testout6.txt");
		int i=r.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i=r.read();
		}
		r.close();
	}
}
