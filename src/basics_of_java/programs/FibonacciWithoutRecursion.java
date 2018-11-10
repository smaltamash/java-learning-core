package basics_of_java.programs;
public class FibonacciWithoutRecursion 
{
	static void fibonacciWithoutRecursion(int no)
	{
		int a=0,b=1,c=0;
		System.out.print(a+" "+b+" ");
		for(int i=0;i<no-2;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
	public static void main(String[] args)
	{
		fibonacciWithoutRecursion(17);
	}
}
