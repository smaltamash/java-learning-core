package oops_concepts.java_oops_misc;
public class RecursionFibonacciSeries 
{
	static int no1=0,no2=1,no3=0;
	static void fibonacci(int count)
	{
		if(count>0)
		{
			no3=no2+no1;
			no1=no2;
			no2=no3;
			System.out.print(no3+" ");
			fibonacci(count-1); //we can even use (--count)
		}
	}
	public static void main(String[] args)
	{
		int count=15;
		System.out.print(RecursionFibonacciSeries.no1+" "+RecursionFibonacciSeries.no2+" ");
		RecursionFibonacciSeries.fibonacci(count-2);
	}
}
