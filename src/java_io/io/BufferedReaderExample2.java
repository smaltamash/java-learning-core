package java_io.io;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class BufferedReaderExample2
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("Enter your name :-");
		String name=br.readLine();
		System.out.println("Welcome "+name);
	}
}
