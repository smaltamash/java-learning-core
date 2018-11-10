package java_regex.java_regex_api;
/*Create a regular expression that accepts alpha numeric characters only. Its 
length must be 6 characters long only.*/  
import java.util.regex.*;  
public class JavaRegexExample5
{  
	public static void main(String args[])
	{  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32")); //true  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32")); //false (more than 6 char)  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2")); //true  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2")); //false ($ is not matched)  
	}
}  