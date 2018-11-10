package java_conversion.conversion;
public class BooleanToStringToStringMethodExample
{
	public static void main(String[] args)throws Exception
	{
		boolean b1=true,b2=false;
		String s1=Boolean.toString(b1),s2=Boolean.toString(b2);
		System.out.println(s1+"\n"+s2);
	}
}

