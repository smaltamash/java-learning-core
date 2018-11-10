package java_io.io;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
public class BufferedReaderExample1
{
	public static void main(String args[])throws IOException
	{
		FileReader fr=new FileReader("src/java_io/io/Java IO Files/testout9.txt");
		BufferedReader br=new BufferedReader(fr);
		int i=0;
		while((i=br.read())!=-1)
		{
			System.out.print((char)i);
		}
		br.close();
	}
}
