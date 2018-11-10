package exception_handling.java_exception_handling;
//Finally when Exception does not Occur
public class FinallyExample1
{
	public static void main(String[]args)
	{
		try
		{
			int data=25/5;
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
