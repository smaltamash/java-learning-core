package oops_concepts.java_oops_misc;
public class WrapperClassPimitiveToWrapper 
{
	public static void main(String[] args)
	{
		//converting int to Integer
		int a=20;
		int b=70;
		Integer i=Integer.valueOf(a); //converting int to Integer
		Integer j=b; //auto-boxing, now compiler will write Integer.valueOf(b) internally 
	    System.out.println(a+" "+i+" "+b+" "+j);
	}
}