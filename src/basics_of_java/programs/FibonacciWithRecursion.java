package basics_of_java.programs;
public class FibonacciWithRecursion 
{
	static int a=0,b=1,c=0;
	static void fibonacciWithRecursion(int no)
	{
		if(no<=1)
		{
			System.out.println("\nPrinted \"Fibonacci Series\"");	
		}
		else
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			fibonacciWithRecursion(no-1);
		}
	}
	public static void main(String[] args)
	{
		System.out.print(a+" "+b+" ");
		fibonacciWithRecursion(17-2);
	}
}
