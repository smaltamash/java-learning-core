package exception_handling.java_exception_handling;
import java.io.IOException;
public class ThrowsKeyword1
{
	void m()throws IOException
	{
		throw new IOException("Device Error"); //Checked Exception
	}
	void n()throws IOException
	{
		m();
	}
	void p()
	{
		try
		{
			n();
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled");
		}
	}
	public static void main(String[]args)
	{
		ThrowsKeyword1 obj=new ThrowsKeyword1();
		obj.p();
		System.out.println("Normal Flow");
	}
}

//By default, Checked Exceptions are not Forwarded in calling chain(not Porpogated) but we can forward(propogate) them using throws keyword
//If you are calling a method that declares an exception you must either catch the exception or declare the exception again in method signature 