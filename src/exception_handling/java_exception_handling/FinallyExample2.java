package exception_handling.java_exception_handling;
//Finally when Exception Occurs and not Handled
public class FinallyExample2
{
	public static void main(String[]args)
	{
		try
		{
			int data=25/0;
			System.out.println(data);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally Block is always executed");
		}
		System.out.println("Rest of the Code");
	}
}
