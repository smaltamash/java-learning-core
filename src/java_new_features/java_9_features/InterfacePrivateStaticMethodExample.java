package java_new_features.java_9_features;
interface Sayable2
{
	default void say()
	{
		saySomething(); //Calling private method
		sayPolitely(); //Calling private static method //We can even use Sayable2.sayPolitely();
	}
	//Private method inside interface
	private void saySomething()
	{
		System.out.println("Hello.... I am private method");
	}
	//Private static method inside interface
	private static void sayPolitely()
	{
		System.out.println("I am private static method");
	}
}
public class InterfacePrivateStaticMethodExample implements Sayable2
{
	public static void main(String args[])
	{
		Sayable2 s=new InterfacePrivateStaticMethodExample();
		s.say();
	}
}