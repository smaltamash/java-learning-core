package java_conversion.conversion;
//Understanding String Concatenation Operator
public class StringToIntParseIntMethodExample2
{
	public static void main(String[] args)
	{
		String s="200";
		int i=Integer.parseInt(s);
		System.out.println(s+100); //200100, because "200"+100, here + is a string concatenation operator 
		System.out.println(i+100); //300, because 200+100, here + is a binary plus operator
	}
}