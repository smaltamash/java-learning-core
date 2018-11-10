package oops_concepts.java_oops_misc;
public class RecursionFactorial 
{
	static int factorial(int no)
	{
		if(no==1)
		{
			return 1;
		}
		else
		{
			return no*factorial(no-1);
		}
	}
	public static void main(String[] args)
	{
		System.out.println(RecursionFactorial.factorial(5));
	}
}

/*
Working Of Above Program:
factorial(5) 
   factorial(4) 
      factorial(3) 
         factorial(2) 
            factorial(1) 
               return 1 
            return 2*1 = 2 
         return 3*2 = 6 
      return 4*6 = 24 
   return 5*24 = 120
*/   
