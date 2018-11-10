package exception_handling.java_exception_handling;
public class ThrowExample
{
	static void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("not valid"); //We can even use () only in Parameters like throw new ArithmeticException();
		}
		else 
		{
			System.out.println("Welcome to Vote");
		}
	}
	public static void main(String[]args)
	{
		validate(13);
		System.out.println("Rest of the Code");
	}
}
