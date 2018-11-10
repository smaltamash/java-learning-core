package java_multithreading.multithreading;
public class ThreadJoinMethod extends Thread
{ 
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[]args)
	{
		ThreadJoinMethod t1=new ThreadJoinMethod();
		ThreadJoinMethod t2=new ThreadJoinMethod();
		ThreadJoinMethod t3=new ThreadJoinMethod();
		t1.start();
		try
		{
			t1.join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		t2.start();
		t3.start();
	}
}