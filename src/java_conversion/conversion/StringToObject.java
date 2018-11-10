package java_conversion.conversion;
public class StringToObject
{
	public static void main(String[] args)throws Exception
	{
		Class c=Class.forName("java.lang.String");
		System.out.println("Class Name : "+c.getName());
		System.out.println("Super Class Name : "+c.getSuperclass().getName());
	}
}