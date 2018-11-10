package java_multithreading.multithreading;
public class  MultipleTaskByMultipleThreadWithAnonymousClassUsingThread
{
	public static void main(String[]args)
	{
		Thread t1=new Thread(){
			public void run()
			{
				System.out.println("Task 1");
			}
		};
		Thread t2=new Thread(){
			public void run()
			{
				System.out.println("Task 2");
			}
		};
		Thread t3=new Thread(){
			public void run()
			{
				System.out.println("Task 3");
			}
		};
		t1.start();
		t2.start();
		t3.start();
	}
}