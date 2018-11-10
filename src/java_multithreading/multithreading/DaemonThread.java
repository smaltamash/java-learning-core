package java_multithreading.multithreading;
public class DaemonThread extends Thread
{ 
	public void run()
	{
		if(Thread.currentThread().isDaemon()) //checking for Daemon Thread
		{
			System.out.println("Daemon Thread Working");
		}
		else
		{
			System.out.println("User Thread Working");
		}
	}
	public static void main(String[]args)
	{
		DaemonThread t1=new DaemonThread();
		DaemonThread t2=new DaemonThread();
		DaemonThread t3=new DaemonThread();
		//t1.start(); //if we want to make a user thread as a daemon thread we cannot start it until we make it a daemon thread else it will show IllegalThreadStateException 
 		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
	}
}