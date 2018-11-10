package exception_handling.java_exception_handling;
import java.io.*;
class Parent6
{
	void msg()throws Exception
	{
		System.out.println("Parent");
	}
}
public class ExceptionHandlingMethodOverridingCase2D extends Parent6
{
	void msg()
	{
		System.out.println("Child");
	}
	public static void main(String[]args)
	{
		Parent6 p1=new ExceptionHandlingMethodOverridingCase2D();
		try
		{
			p1.msg();
		}
		catch(Exception e)
		{}
	}
}

//If superclass method declares an exception subclass overridden method can declare no exception