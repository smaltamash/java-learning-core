package java_multithreading.multithreading;
class MyThread extends Thread
{
	public void run()
	{
		System.out.println("Shut Down Hook task Completed");
	}
}
public class ShutdownHookExample
{
	public static void main(String[]args)
	{
		Runtime r=Runtime.getRuntime();
		r.addShutdownHook(new MyThread());
		System.out.println("Now Main Sleeping press ctrl+c to exit");
		try
		{
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}

}