package java_reflection.reflection;
class Simple3{}
interface My{}
public class DeterminingClassObject
{
	public static void main(String args[])throws Exception
	{
		try
		{
			Class c=Class.forName("Simple3");
			System.out.println(c.isInterface());
		    Class c2=Class.forName("My");
		    System.out.println(c2.isInterface());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}