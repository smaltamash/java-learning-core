package java_conversion.conversion;
//Method Two to convert float to String
public class FloatToStringToStringMethodExample
{
	public static void main(String[] args)
	{
		float f=82.3f; //you have to use f or F or else it will give error because decimal value is by default double  
		String s=Float.toString(f);
		System.out.println(s);
	}
}