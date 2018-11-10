package java_multithreading.java_synchronization;
class Table7
{
	static synchronized void printTable7(int n)
	{
		for(int i=1;i<=5;i++)
	    {
	    	System.out.println(n*i);
	        try
	        {
		        Thread.sleep(1000);
	        }
	        catch(InterruptedException e)
	        {
	        	System.out.println(e);
	        }
	    }
	}
}
public class  WithSynchronizationUsingStaticSynchronizationUsingAnonymousClass
{
	public static void main(String[]args) 
	{
		Thread t1=new Thread(){

			public void run()
			{
				Table7.printTable7(5);
			}
		};
		Thread t2=new Thread(){
			public void run()
			{
				Table7.printTable7(100);
			}
		};
		Thread t3=new Thread(){

			public void run()
			{
				Table7.printTable7(10);
			}
		};
		Thread t4=new Thread(){
			public void run()
			{
				Table7.printTable7(1000);
			}
		};
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}