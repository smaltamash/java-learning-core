package java_conversion.conversion;
//Method One to Convert float to String 
public class FloatToStringValueOfMethodExample
{
	public static void main(String[] args)
	{
		float f=12.3f; //you have to use f or F or else it will give error because decimal value is by default double  
		String s=String.valueOf(f);
		System.out.println(s);
	}
}