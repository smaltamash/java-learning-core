package exception_handling.java_exception_handling;
public class FinalizeMethod
{
	public void finalize()
	{
		System.out.println("Finalize Called");
	}
	public static void main(String[]args)
	{
		FinalizeMethod p1=new FinalizeMethod();
		FinalizeMethod p2=new FinalizeMethod();
		p1=null;
		p2=null;
		System.gc();
	}
}

//Finalize Method is used to perform clean up process just before object is garbage collected
