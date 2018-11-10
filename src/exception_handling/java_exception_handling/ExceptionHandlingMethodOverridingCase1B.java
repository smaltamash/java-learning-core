package exception_handling.java_exception_handling;
import java.io.*;
class Parent1
{
	void msg()
	{
		System.out.println("Parent");
	}
}
public class ExceptionHandlingMethodOverridingCase1B extends Parent1
{
	void msg()throws ArithmeticException
	{
		System.out.println("Child");
	}
	public static void main(String[]args)
	{
		Parent1 p1=new ExceptionHandlingMethodOverridingCase1B();
		p1.msg();
	}
}

//If superclass method does not declare an exception subclass overridden method cannot declare checked exception but can declare unchecked Exception