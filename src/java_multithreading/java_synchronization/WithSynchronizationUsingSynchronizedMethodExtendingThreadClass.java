package java_multithreading.java_synchronization;
class Table2
{
	synchronized void printTable(int n)
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
class MyThread3 extends Thread
{
	Table2 t;
	MyThread3(Table2 t)
	{
		this.t=t;
	}
    public void run()
    {
    	t.printTable(5);
    }
}
class MyThread4 extends Thread
{
	Table2 t;
	MyThread4(Table2 t)
	{
		this.t=t;
	}
    public void run()
    {
    	t.printTable(100);
    }
}
public class  WithSynchronizationUsingSynchronizedMethodExtendingThreadClass
{
	public static void main(String[]args) 
	{
		Table2 obj=new Table2();
		MyThread3 t1=new MyThread3(obj);
		MyThread4 t2=new MyThread4(obj);
		t1.start();
		t2.start();
	}
}