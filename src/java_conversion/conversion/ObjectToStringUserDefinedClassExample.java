package java_conversion.conversion;
class Emp{}
public class ObjectToStringUserDefinedClassExample
{
	public static void main(String[] args)throws Exception
	{
		Emp e=new Emp();
		String s=e.toString();
		String s2=String.valueOf(e);
		System.out.println(s);
		System.out.println(s2);
	}
}