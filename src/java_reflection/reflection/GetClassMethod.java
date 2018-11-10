package java_reflection.reflection;
class Simple2{}
public class GetClassMethod
{
	void printName(Object obj)
	{
		Class c=obj.getClass();
		System.out.println(c.getName());
	}
	public static void main(String args[])throws Exception
	{
		Simple2 s=new Simple2();
		GetClassMethod p=new GetClassMethod();
		p.printName(s);
	}
}