package java_conversion.conversion;
public class PalindromeStringExample
{
	public static void main(String[] args)throws Exception
	{
		String s="nitin";  
		StringBuilder sb=new StringBuilder(s);  
		sb.reverse();  
		String rev=sb.toString();//converting StringBuilder to String  
		if(s.equals(rev))
		{  
			System.out.println("Palindrome String");  
		}
		else
		{  
			System.out.println("Not Palindrome String");  
		}  	
	}
}