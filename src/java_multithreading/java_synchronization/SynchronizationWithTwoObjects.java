package java_multithreading.java_synchronization;
///*
class Table6
{
	void printTable(int n)
	{
		synchronized(Table6.class)
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
public class  SynchronizationWithTwoObjects
{
	public static void main(String[]args) 
	{
		Table6 obj=new Table6();
		Table6 obj2=new Table6();
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
		Thread t3=new Thread(){

			public void run()
			{
				obj2.printTable(10);
			}
		};
		Thread t4=new Thread(){
			public void run()
			{
				obj2.printTable(1000);
			}
		};
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
//*/

//This code will give inconsistent output
/*
class Table6
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
public class  SynchronizationWithTwoObjects
{
	public static void main(String[]args) 
	{
		Table6 obj=new Table6();
		Table6 obj2=new Table6();
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
		Thread t3=new Thread(){

			public void run()
			{
				obj2.printTable(10);
			}
		};
		Thread t4=new Thread(){
			public void run()
			{
				obj2.printTable(1000);
			}
		};
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
//*/