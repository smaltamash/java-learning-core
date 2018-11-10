package java_multithreading.multithreading;
public class ThreadExampleByImplementingRunnableInterface implements Runnable
{ 
	public void run()
	{
		System.out.println("Thread is running");
	}
	public static void main(String[]args)
	{
		Runnable obj=new ThreadExampleByImplementingRunnableInterface(); //Here we can even use ThreadExampleByImplementingRunnableInterface obj=new ThreadExampleByImplementingRunnableInterface();
		Thread t1=new Thread(obj);
		t1.start();
	}
}