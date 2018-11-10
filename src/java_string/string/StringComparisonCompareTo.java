package java_string.string;
public class StringComparisonCompareTo
{
	public static void main(String []args)
	{
		String s1="Sachin";
		String s2="Sachin"; 
		String s3="Ratan";
		System.out.println(s1.compareTo(s2)); //0
        System.out.println(s1.compareTo(s3)); //positive value(1)
        System.out.println(s3.compareTo(s1)); //negative value(-1)
    }
}