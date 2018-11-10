package java_conversion.conversion;
//Method One to convert String to double
public class StringToDoubleParseDoubleMethodExample
{
	public static void main(String[] args)
	{
		String s="24.7";
        double d=Double.parseDouble(s);
        System.out.println(d);
	}
}