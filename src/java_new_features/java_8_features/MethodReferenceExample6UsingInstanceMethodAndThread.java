package java_new_features.java_8_features;
public class MethodReferenceExample6UsingInstanceMethodAndThread
{
	public void printMsg()
	{
		System.out.println("Hello, This is instance(non-static) method");
	}
	public static void main(String[] args)
	{
		Thread t2=new Thread(new MethodReferenceExample6UsingInstanceMethodAndThread()::printMsg);
		t2.start();
	}
}