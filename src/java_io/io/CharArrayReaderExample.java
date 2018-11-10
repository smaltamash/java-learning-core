package java_io.io;
import java.io.IOException;
import java.io.CharArrayReader;
public class CharArrayReaderExample
{
	public static void main(String args[])throws IOException
	{
		char[] ch={'F','a','i','z','a'};
		CharArrayReader cr=new CharArrayReader(ch);
		int k=0;
		//read until end of file	
		while((k=cr.read())!=-1)
		{
			char c=(char)k;
			System.out.print(c+" : ");
			System.out.println(k);
		}
		//cr.close(); //this line is not necessary
	}
}
