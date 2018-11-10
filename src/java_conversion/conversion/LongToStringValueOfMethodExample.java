package java_conversion.conversion;
//Method One to convert long to String
public class LongToStringValueOfMethodExample
{
	public static void main(String[] args)
	{
		long l=998943434242411L; //L or l is suffix for long(any number is int by default if it exceds int range it will give exception so thats why we use l or L)
		String s=String.valueOf(l);
		System.out.println(s);
	}
}