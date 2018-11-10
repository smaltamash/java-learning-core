package exception_handling.java_exception_handling;
//At one time only one Exception is occurred and at a time only one catch block is executed
///*
public class MultiCatchBlock1
{
	public static void main(String[]args)
	{
		try
		{
			int a[]=new int[5];
		    a[5]=30/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException");    
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
		System.out.println("Rest of Code");
	}
}
//*/


//All Catch Block must be ordered from most specific to mist general i.e. catch for ArithmeticException must come before catch for Exception else it will give Compile Time Error 
/*
public class MultiCatchBlock1
{
	public static void main(String[]args)
	{
		try
		{
			int a[]=new int[5];
		    a[5]=30/0;
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException");    
		}
		System.out.println("Rest of Code");
	}
}
//*/
