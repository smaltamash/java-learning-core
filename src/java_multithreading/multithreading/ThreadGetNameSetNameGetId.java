package java_multithreading.multithreading;
public class ThreadGetNameSetNameGetId extends Thread
{ 
	public void run()
	{
		System.out.println("Thread Running...");
	}
	public static void main(String[]args)
	{
		ThreadGetNameSetNameGetId t1=new ThreadGetNameSetNameGetId();
		ThreadGetNameSetNameGetId t2=new ThreadGetNameSetNameGetId();
		System.out.println("Name of t1 = "+t1.getName());
		System.out.println("Name Of t2 = "+t2.getName());
		System.out.println("ID of t1 = "+t1.getId());
		t1.start();
		t2.start();
		t1.setName("Priya Aggarwal");
		System.out.println("After changing name of t1 = "+t1.getName());
	}
}