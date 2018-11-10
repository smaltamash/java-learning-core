package basics_of_java.programs;
public class Palindrome 
{
	static void palindrome(int no)
	{
		int no1=no,no2=0,x=0;
		while(no1>0)
		{
			x=no1%10;
			no2=no2+x;
			no2*=10;
			no1/=10;
		}		
		if(no==no2/10)
		{
			System.out.println("\""+no+"\" is a Palindrome Number");
		}
		else
		{
			System.out.println("\""+no+"\" is not a Palindrome Number");
		}
	}
	public static void main(String[] args)
	{
		palindrome(3412143);
	}
}
