package java_reflection.reflection;
class Simple4
{
	void message()
	{
		System.out.println("Hello Java");
	}
}
public class NewInstanceMethod
{
	public static void main(String args[])throws Exception
	{
		try
		{
			Class c=Class.forName("Simple4");
			Simple4 s=(Simple4)c.newInstance();
			s.message();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}