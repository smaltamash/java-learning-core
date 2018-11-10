package exception_handling.java_exception_handling;
public class RethrowingAnException
{
	public static void main(String[]args)
	{
		try
		{
			System.out.println(args[0]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			throw e; //Rethrowing an exception
		}
	}
}

//We can rethow an exception by throwing same exception in catch block 
