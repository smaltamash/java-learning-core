package java_io.io;
import java.io.IOException;
import java.io.FileReader;
public class FileReaderExample
{
	public static void main(String args[])throws IOException
	{
		FileReader fr=new FileReader("src/java_io/io/Java IO Files/testout8.txt");
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		fr.close();
	}
}
