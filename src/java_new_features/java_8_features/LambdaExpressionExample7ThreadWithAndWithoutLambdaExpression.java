package java_new_features.java_8_features;
public class LambdaExpressionExample7ThreadWithAndWithoutLambdaExpression
{
	public static void main(String []args)
	{
		//Thread example without Lambda Expression
		Runnable r1=new Runnable(){
			public void run(){
				System.out.println("Thread1 is running....");
			}
		};
		Thread t1=new Thread(r1);
		t1.start();
		//Thread Example with Lambda Expression
		Runnable r2=()->{
			System.out.println("Thread2 is running....");
		};
		Thread t2=new Thread(r2);
		t2.start();
	}
}