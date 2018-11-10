package java_multithreading.multithreading;
public class ThreadExampleByExtendingThreadClass extends Thread
{ 
	public void run()
	{
		System.out.println("Thread is running");
	}
	public static void main(String[]args)
	{
		ThreadExampleByExtendingThreadClass t1=new ThreadExampleByExtendingThreadClass();
		t1.start();
	}
}