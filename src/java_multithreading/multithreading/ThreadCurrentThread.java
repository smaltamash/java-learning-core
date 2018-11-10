package java_multithreading.multithreading;
public class ThreadCurrentThread extends Thread
{ 
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[]args)
	{
		ThreadCurrentThread t1=new ThreadCurrentThread();
		ThreadCurrentThread t2=new ThreadCurrentThread();
		t1.start();
		t2.start();
	}
}