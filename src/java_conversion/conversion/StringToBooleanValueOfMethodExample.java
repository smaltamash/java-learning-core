package java_conversion.conversion;
public class StringToBooleanValueOfMethodExample
{
	public static void main(String[] args)throws Exception
	{
		String s1="true";
		String s2="TRue";
		String s3="ok";
		Boolean b1=Boolean.valueOf(s1);
		Boolean b2=Boolean.valueOf(s2);
		Boolean b3=Boolean.valueOf(s3);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}
}

