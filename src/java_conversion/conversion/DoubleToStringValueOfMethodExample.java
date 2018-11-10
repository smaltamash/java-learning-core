package java_conversion.conversion;
//Method One to convert double to String
public class DoubleToStringValueOfMethodExample
{
	public static void main(String[] args)
	{
		double d=13.31; //floating value is double by default you can even use d or D
        String s=String.valueOf(d);
        System.out.println(s);
	}
}