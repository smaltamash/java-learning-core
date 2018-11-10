package oops_concepts.java_oops_misc;
public class WrapperClassWrapperToPrimitive 
{
	public static void main(String[] args)
	{
		//converting Integer to int
		Integer a=30;
		Integer b=60;
		int i=a.intValue(); //converting Integer to int
		Integer j=b; //unboxing(auto-unboxing), now compiler will write b.intValue() internally 
	    System.out.println(a+" "+i+" "+b+" "+j);
	}
}