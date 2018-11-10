package java_new_features.java_7_features;
public class MulipleExceptionInCatchExample
{
	public static void main(String[] args)
    {
    	try
    	{
    		int array[]=new int[10];
    		array[10]=30/0;
    	}
    	catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
    	{
    		System.out.println(e.getMessage());
    	}
    }
}