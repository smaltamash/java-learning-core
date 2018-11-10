package java_io.io;
import java.io.IOException;
import java.io.StringReader;
public class StringReaderExample
{
	public static void main(String args[])throws IOException
	{
		String srg="Hello Everyone, \nI am Daisy.";
		StringReader sr =new StringReader(srg);
		int k=0;
		while((k=sr.read())!=-1)
		{
			System.out.print((char)k);
		}
		
	} 
}
