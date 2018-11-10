package java_multithreading.multithreading;
public class SingleTaskByMultipleThreads extends Thread
{
	public void run()
	{
		System.out.println("Task 1");
	}
	public static void main(String[]args)
	{
		SingleTaskByMultipleThreads t1=new SingleTaskByMultipleThreads();
		SingleTaskByMultipleThreads t2=new SingleTaskByMultipleThreads();
		SingleTaskByMultipleThreads t3=new SingleTaskByMultipleThreads();
		t1.start();
		t2.start();
		t3.start();
	}
}

//Each Thread run in a seperate call stack