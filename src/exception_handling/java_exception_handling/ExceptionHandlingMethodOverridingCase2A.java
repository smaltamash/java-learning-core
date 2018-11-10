package exception_handling.java_exception_handling;
import java.io.*;
class Parent2
{
	void msg()throws ArithmeticException
	{
		System.out.println("Parent");
	}
}
public class ExceptionHandlingMethodOverridingCase2A extends Parent2
{
	void msg() //throws Exception
	{
		System.out.println("Child");
	}
	public static void main(String[]args)
	{
		Parent2 p1=new ExceptionHandlingMethodOverridingCase2A();
		p1.msg();
	}
}

//I superclass method declares an exception subclass overridden method cannot declare parent exception esle it will give Compile Time Error