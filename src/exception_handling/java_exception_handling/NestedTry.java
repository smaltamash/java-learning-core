package exception_handling.java_exception_handling;
public class NestedTry
{
	public static void main(String[]args)
	{
		try
		{
			try
			{
				System.out.println("Going to Divide");
				int b=39/0;
			}
			catch(ArithmeticException e)
		    {
		    	System.out.println(e);    
		    }
		    try
		    {
		    	int a[]=new int[5];
		    	a[5]=4;
		    }
		    catch(ArrayIndexOutOfBoundsException e)
		    {
		    	System.out.println(e);
		    }
		    System.out.println("Other Statement");
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled");
		}
		System.out.println("Normal Flow");
	}
}
