package java_multithreading.java_synchronization;
class Table5
{
	synchronized void printTable(int n)
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
class MyThread5 extends Thread
{
	Table5 t;
	MyThread5(Table5 t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(5);
	}
}
class MyThread6 extends Thread
{
	Table5 t;
	MyThread6(Table5 t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(100);
	}
}
public class  WithSynchronizationUsingSynchronizedBlockExtendingThreadClass
{
	public static void main(String[]args) 
	{
		Table5 obj=new Table5();
		MyThread5 t1=new MyThread5(obj);
		MyThread6 t2=new MyThread6(obj);
		t1.start();
		t2.start();
	}
}