package java_multithreading.multithreading;
public class CallingRunMethodDirectly2 extends Thread
{ 
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try
			{
				Thread.sleep(400);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[]args)
	{
		CallingRunMethodDirectly2 t1=new CallingRunMethodDirectly2();
		t1.run();
		CallingRunMethodDirectly2 t2=new CallingRunMethodDirectly2();
		t2.run();
	}
}

//There is no Context-Switching