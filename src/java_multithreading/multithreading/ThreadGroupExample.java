package java_multithreading.multithreading;
public class ThreadGroupExample implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[]args)
	{
		ThreadGroupExample runnable=new ThreadGroupExample();
		ThreadGroup tg1=new ThreadGroup("Parent Thread Group");
		Thread t1=new Thread(tg1,runnable,"One");
		t1.start();
		Thread t2=new Thread(tg1,runnable,"Two");
		t2.start();
		Thread t3=new Thread(tg1,runnable,"Three");
		t3.start();
		System.out.println("Thread Group Name : "+tg1.getName());
		tg1.list();
	}

}