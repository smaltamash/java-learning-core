package exception_handling.java_exception_handling;
import java.io.IOException;
class M
{
	void method()throws IOException
	{
		throw new IOException("Device Error"); //Checked Exception
	}
}
public class ThrowsKeywordCase1
{
	public static void main(String[]args)
	{
		try
		{
			M m=new M();
			m.method();
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled");
		}
		System.out.println("Normal Flow");
	}
}

//In case you handled the exception using try-catch code will be executed fine
