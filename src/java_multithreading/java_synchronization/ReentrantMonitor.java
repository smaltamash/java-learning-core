package java_multithreading.java_synchronization;
class Reentrant
{
	public synchronized void m()
	{
		n();
		System.out.println("this is m() method");
	}
	public synchronized void n()
	{
		System.out.println("This is n() method");
	}
}
public class ReentrantMonitor
{
	public static void main(String[] args)
	{
		final Reentrant re=new Reentrant();
		Thread t1=new Thread(){
			public void run()
			{
				re.m(); //Calling method of Reentrant Class
			}
		};
		t1.start();
	}
}