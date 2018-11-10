/*
package java_io.io;
import java.io.IOException;
import java.io.Console;
public class ConsoleClassExample
{
	public static void main(String args[])throws IOException
	{
		Console c=System.console();
		//System.out.println("Enter your name :-");
		//String name=c.readLine();
		System.out.println("Enter your password :-");
		char[] pass=c.readPassword();
		String p=String.valueOf(pass); //Converting char array into String
		System.out.println("Hi "+"name"+" your password is "+p);
	}
}
*/

//Run above program in console if you run it on IDE it will give NullPointerException because IDE does not use Console 