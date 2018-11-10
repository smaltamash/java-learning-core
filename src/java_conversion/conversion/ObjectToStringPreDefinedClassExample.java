package java_conversion.conversion;
public class ObjectToStringPreDefinedClassExample
{
	public static void main(String[] args)throws Exception
	{
		String s="Garima";
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		String rev=sb.toString(); //converting StringBuilder to String
		System.out.println("String is : "+s);
		System.out.println("Reverse String is : "+rev);	
	}
}