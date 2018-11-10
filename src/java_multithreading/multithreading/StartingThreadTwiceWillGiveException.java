package java_multithreading.multithreading;
public class StartingThreadTwiceWillGiveException extends Thread
{ 
	public void run()
	{
		System.out.println("Thread is running");
	}
	public static void main(String[]args)
	{
		StartingThreadTwiceWillGiveException t1=new StartingThreadTwiceWillGiveException();
		t1.start();
		t1.start();
	}
}