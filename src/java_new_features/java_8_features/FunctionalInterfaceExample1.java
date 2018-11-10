package java_new_features.java_8_features;
@FunctionalInterface
interface Sayable5
{
	void say(String msg);
}
public class FunctionalInterfaceExample1 implements Sayable5
{
	public void say(String msg)
	{
		System.out.println(msg);
	}
	public static void main(String[] args)
	{
		FunctionalInterfaceExample1 fie=new FunctionalInterfaceExample1();
		fie.say("Hello there");
	}
}