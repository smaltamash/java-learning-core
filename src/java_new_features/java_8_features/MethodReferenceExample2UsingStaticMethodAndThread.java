package java_new_features.java_8_features;
public class MethodReferenceExample2UsingStaticMethodAndThread
{
	public static void threadStatus()
	{
		System.out.println("Thread is running....");
	}
	public static void main(String[] args)
	{
		Thread t=new Thread(MethodReferenceExample2UsingStaticMethodAndThread::threadStatus);
        t.start();
 	}
}