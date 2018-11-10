package exception_handling.java_exception_handling;
public class ExceptionPropogation1
{
	void m()
	{
		int data=50/0;
	}
	void n()
	{
		m();
	}
	void p()
	{
		try
		{
			n();
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled");
		}
	}
	public static void main(String[]args)
	{
		ExceptionPropogation1 obj=new ExceptionPropogation1();
		obj.p();
		System.out.println("Normal Flow");
	}
}

//By default, Unchecked Exception are forwarded in calling chain(are Porpogated);