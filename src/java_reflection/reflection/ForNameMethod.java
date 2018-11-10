package java_reflection.reflection;
class Simple1{}
public class ForNameMethod
{
	public static void main(String args[])throws Exception
	{
		Class c=Class.forName("Simple1");
		System.out.println(c.getName());
	}
}