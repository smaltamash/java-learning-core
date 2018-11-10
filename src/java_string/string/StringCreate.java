package java_string.string;
public class StringCreate
{
	public static void main(String []args)
	{
		String s1="java"; //creating String by java String Literal
		char ch[]={'s','t','u','d','y'};
		String s2=new String(ch); //converting char array to string
		String s3=new String("example"); //creating java String by new Keyword
		System.out.println(s1+"\n"+s2+"\n"+s3);
	}
}