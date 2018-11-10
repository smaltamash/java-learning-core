package java_new_features.java_9_features;
interface Sayable1
{
	default void say()
	{
		saySomething();
	}
	//Private method inside interface
	private void saySomething()
	{
		System.out.println("Hello.... I am private method");
	}
}
public class InterfacePrivateMethodExample implements Sayable1
{
	public static void main(String args[])
	{
		Sayable1 s=new InterfacePrivateMethodExample();
		s.say();
	}
}