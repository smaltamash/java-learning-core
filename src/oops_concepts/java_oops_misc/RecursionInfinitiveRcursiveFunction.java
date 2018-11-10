package oops_concepts.java_oops_misc;
public class RecursionInfinitiveRcursiveFunction 
{
	static void p()
	{
		System.out.println("Hello");
		p(); //recursion
	}
	public static void main(String[] args)
	{
		p();
	}
}

/*
  whenever a function calls itself it is called recursion,
  infinite recursive function will give java.lang.StackOverflowError Exception 
  because functions when called are kept in stack and 
  when their work is completed they are removed from stack.
*/  