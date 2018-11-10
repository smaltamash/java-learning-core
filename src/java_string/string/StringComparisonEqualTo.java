package java_string.string;
public class StringComparisonEqualTo
{
	public static void main(String[]args)
	{
		String s1="Sachin ";
		String s2="Sachin "; 
		String s3=new String("Sachin ");
		System.out.println(s1==s2); //true
        System.out.println(s1==s3); //false
    }
}