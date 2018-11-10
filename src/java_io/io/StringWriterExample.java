package java_io.io;
import java.io.IOException;
import java.io.StringWriter;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class StringWriterExample
{
	public static void main(String args[])throws IOException
	{
		char ary[]=new char[525];
		StringWriter sw =new StringWriter();
		FileInputStream fin=new FileInputStream("/home/auzad/Desktop/Java IO Files/testout11.txt");
		BufferedReader br=new BufferedReader(new InputStreamReader(fin,"UTF-8"));
		int x;
		while((x=br.read(ary))!=-1)
		{
			sw.write(ary,0,x);
		}
		System.out.println(sw.toString());
        br.close();
		sw.close();
	} 
}
