package java_multithreading.multithreading;
public class ThreadPriority extends Thread
{ 
	public void run()
	{
		System.out.println("Running Thread Name : "+Thread.currentThread().getName());
		System.out.println("Running Thread Priority : "+Thread.currentThread().getPriority());
	}
	public static void main(String[]args)
	{
		ThreadPriority t1=new ThreadPriority();
		ThreadPriority t2=new ThreadPriority();
		ThreadPriority t3=new ThreadPriority();
		ThreadPriority t4=new ThreadPriority();
		ThreadPriority t5=new ThreadPriority();
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		t4.setPriority(Thread.MAX_PRIORITY);
		t5.setPriority(7);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}