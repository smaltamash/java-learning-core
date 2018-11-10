package basics_of_java.programs;
public class Factorial 
{
	static void factorial(int no)
	{
		int fact =1;
		for(int i=no;i>0;i--)
		{
			fact*=i;
		}
		System.out.println("Factorial of \""+no+"\" is = "+fact);
	}
	public static void main(String[] args)
	{
		factorial(5);
	}
}
