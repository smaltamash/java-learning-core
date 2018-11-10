package exception_handling.java_exception_handling;
import java.io.*;
class Parent
{
	void msg()
	{
		System.out.println("Parent");
	}
}
public class ExceptionHandlingMethodOverridingCase1A extends Parent
{
	void msg() //throws IOException
	{
		System.out.println("Child");
	}
	public static void main(String[]args)
	{
		Parent p1=new ExceptionHandlingMethodOverridingCase1A();
		p1.msg();
	}
}

//If superclass method does not declare an exception subclass overridden method cannot declare checked exception or else it will give compile time error
