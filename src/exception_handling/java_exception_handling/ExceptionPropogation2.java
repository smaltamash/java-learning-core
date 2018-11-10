package exception_handling.java_exception_handling;
public class ExceptionPropogation2
{
	void m()
	{
		//throw new java.io.IOException("Device Error"); //Checked Exception
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
		ExceptionPropogation2 obj=new ExceptionPropogation2();
		obj.p();
		System.out.println("Normal Flow");
	}
}
 //By default, Checked Exceptions are not Forwarded in calling chain(are not Porpogated)