package java_multithreading.java_synchronization;
public class InterruptMethodExceptionDoNotOccurred extends Thread
{  
	public void run()
	{  
		System.out.println("task");  
		System.out.println("Thread is Running");
	}  
	public static void main(String args[])
	{  
		InterruptMethodExceptionDoNotOccurred t1=new InterruptMethodExceptionDoNotOccurred();  
		t1.start();  
		t1.interrupt();  
	}  
}  