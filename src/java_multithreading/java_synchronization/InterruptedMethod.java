package java_multithreading.java_synchronization;
public class InterruptedMethod extends Thread
{  
	public void run()
	{  
		for(int i=1;i<=2;i++)
		{  
			if(Thread.interrupted())
			{  
				System.out.println("code for interrupted thread");  
			}  
			else
			{  
				System.out.println("code for normal thread");  
			}  
		}//end of for loop  
	}  
	public static void main(String args[])
	{  
		InterruptedMethod t1=new InterruptedMethod();  
		InterruptedMethod t2=new InterruptedMethod();  
		t1.start();  
		t1.interrupt();  
		t2.start();  
	}  
}  
