package exception_handling.java_exception_handling;
/*
public class ExceptionUse1
{
	public static void main(String[]args)
	{
		int data=50/0; //May throw Exception
		System.out.println("Rest of Code");
	}
}
 */

// Solution by Exception Handling 
///*
public class ExceptionUse1
{
	public static void main(String[]args)
	{
		try
		{
			int data=50/0; 
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);    
		}
		System.out.println("Rest of Code");
	}
}
//*/