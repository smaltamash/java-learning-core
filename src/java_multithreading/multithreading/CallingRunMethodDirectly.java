package java_multithreading.multithreading;
public class CallingRunMethodDirectly extends Thread
{ 
	public void run()
	{
		System.out.println("running");
	}
	public static void main(String[]args)
	{
		CallingRunMethodDirectly t1=new CallingRunMethodDirectly();
		t1.run(); //fine but do not start as a separate call stack
    }
}