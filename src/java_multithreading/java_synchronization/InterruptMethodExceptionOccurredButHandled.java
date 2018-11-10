package java_multithreading.java_synchronization;
public class InterruptMethodExceptionOccurredButHandled extends Thread
{  
	public void run()
	{  
		try
		{  
			Thread.sleep(1000);  
			System.out.println("task");  
		}
		catch(InterruptedException e)
		{  
			System.out.println("Exception Handled : "+e);  
		}  
		System.out.println("Thread is Running");
	}  
	public static void main(String args[])
	{  
		InterruptMethodExceptionOccurredButHandled t1=new InterruptMethodExceptionOccurredButHandled();  
		t1.start();  
		t1.interrupt();  
	}  
}  