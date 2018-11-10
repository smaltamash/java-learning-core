package java_reflection.reflection;
public class DotClassSyntax
{
	public static void main(String args[])throws Exception
	{
		Class c=boolean.class;
		System.out.println(c.getName());
		Class c2=DotClassSyntax.class;
		System.out.println(c2.getName());
	}
}