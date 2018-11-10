package java_multithreading.multithreading;
public class  MultipleTaskByMultipleThreadWithAnonymousClassUsingRunnable
{
	public static void main(String[]args)
	{
		Runnable r1=new Runnable(){
			public void run()
			{
				System.out.println("Task 1");
			}
		};
		Runnable r2=new Runnable(){
			public void run()
			{
				System.out.println("Task 2");
			}
		};
		Runnable r3=new Runnable(){
			public void run()
			{
				System.out.println("Task 3");
			}
		};
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		Thread t3=new Thread(r3);
		t1.start();
		t2.start();
		t3.start();
	}

}