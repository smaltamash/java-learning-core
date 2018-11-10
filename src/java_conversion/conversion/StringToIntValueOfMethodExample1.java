package java_conversion.conversion;
//Method Two to convert int to String
public class StringToIntValueOfMethodExample1
{
	public static void main(String[] args)
	{
		String s="200";
		int i=Integer.valueOf(s);
	    //Integer i=Integer.valueOf(s);
		System.out.println(i);
	}
}