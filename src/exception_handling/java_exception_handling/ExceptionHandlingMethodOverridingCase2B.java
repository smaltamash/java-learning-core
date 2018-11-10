package exception_handling.java_exception_handling;
import java.io.*;
class Parent4
{
	void msg()throws Exception
	{
		System.out.println("Parent");
	}
}
public class ExceptionHandlingMethodOverridingCase2B extends Parent4
{
	void msg()throws ArithmeticException
	{
		System.out.println("Child");
	}
	public static void main(String[]args)
	{
		Parent4 p1=new ExceptionHandlingMethodOverridingCase2B();
		try
		{
			p1.msg();
		}
		catch(Exception e)
		{}
	}
}

//If superclass method declares an exception subclass overridden method cannot declare parent exception but can declare subclass exception