package java_new_features.java_8_features;
interface Doable
{
	default void doIt()
	{
		System.out.println("Do it Now");
	}
}
@FunctionalInterface
interface Sayable8 extends Doable
{
	void say(String msg); //Abstract method
}
public class FunctionalInterfaceExample4FunctionalInterfaceExtendingInterface implements Sayable8
{
	public void say(String msg)
	{
		System.out.println(msg);
	}
	public static void main(String[] args)
	{
		FunctionalInterfaceExample4FunctionalInterfaceExtendingInterface fie=new FunctionalInterfaceExample4FunctionalInterfaceExtendingInterface();
		fie.say("Hello here");
		fie.doIt(); 
	}
}