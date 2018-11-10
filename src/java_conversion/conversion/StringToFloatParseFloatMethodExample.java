package java_conversion.conversion;
//Method One to convert String to float
public class StringToFloatParseFloatMethodExample
{
	public static void main(String[] args)
	{
		String s="23.6";
		//float f=Float.parseFloat("23.6"); //"23.6" is a String
		float f=Float.parseFloat(s);
		System.out.println(f);
	}
}