package exception_handling.java_exception_handling;
import java.io.*;
class Parent5
{
	void msg()throws Exception
	{
		System.out.println("Parent");
	}
}
public class ExceptionHandlingMethodOverridingCase2C extends Parent5
{
	void msg()throws Exception
	{
		System.out.println("Child");
	}
	public static void main(String[]args)
	{
		Parent5 p1=new ExceptionHandlingMethodOverridingCase2C();
		try
		{
			p1.msg();
		}
		catch(Exception e)
		{}
	}
}

//If superclass method declares an exception subclass overridden method can declare same exception