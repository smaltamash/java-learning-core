package java_conversion.conversion;
//Java Program to Demonstrate the case of NumberFormatException
public class StringToIntNumberFormatExceptionExample
{
	public static void main(String[] args)
	{
		String s="Dilpreet Kaur";
		int i=Integer.valueOf(s);
		System.out.println(i);
	}
}