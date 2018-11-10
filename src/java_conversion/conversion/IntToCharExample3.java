package java_conversion.conversion;
public class IntToCharExample3
{
	public static void main(String[] args)throws Exception
	{
		int a=1;
		char c=(char)(a+'0');
		//char c=(char)(a+'2'); //It will print 3
		System.out.println(c);
	}
}
//If you add '0' with int variable, it will return actual value in the char variable. The ASCII value of '0' is 48. So, if you add 1 with 48, it becomes 49 which is equal to 1. The ASCII character of 49 is 1.