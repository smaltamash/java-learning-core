package java_multithreading.java_synchronization;
class Table4
{
	void printTable(int n)
	{
		synchronized(this)
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
}
public class  WithSynchronizationUsingSynchronizedBlockUsingAnonymousClass
{
	public static void main(String[]args) 
	{
		Table4 obj=new Table4();
		Thread t1=new Thread(){

			public void run()
			{
				obj.printTable(5);
			}
		};
		Thread t2=new Thread(){
			public void run()
			{
				obj.printTable(100);
			}
		};
		t1.start();
		t2.start();
	}
}