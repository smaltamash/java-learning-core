package java_multithreading.java_synchronization;
class Table8
{
	static synchronized void printTable(int n)
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
class MyThread7 extends Thread
{
	public void run()
    {
    	Table8.printTable(5);
    }
}
class MyThread8 extends Thread
{
	public void run()
    {
    	Table8.printTable(100);
    }
}
class MyThread9 extends Thread
{
	public void run()
    {
    	Table8.printTable(10);
    }
}
class MyThread10 extends Thread
{
	public void run()
    {
    	Table8.printTable(1000);
    }
}
public class  WithSynchronizationUsingStaticSynchronizationExtendingThreadClass
{
	public static void main(String[]args) 
	{
		MyThread7 t1=new MyThread7();
		MyThread8 t2=new MyThread8();
		MyThread9 t3=new MyThread9();
		MyThread10 t4=new MyThread10();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}