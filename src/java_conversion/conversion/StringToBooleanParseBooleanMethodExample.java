package java_conversion.conversion;
public class StringToBooleanParseBooleanMethodExample
{
	public static void main(String[] args)throws Exception
	{
		String s1="true";
		String s2="TRue";
		String s3="ok";
		boolean b1=Boolean.parseBoolean(s1);
		boolean b2=Boolean.parseBoolean(s2);
		boolean b3=Boolean.parseBoolean(s3);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}
}

