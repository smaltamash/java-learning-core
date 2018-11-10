package java_new_features.java_8_features;
@FunctionalInterface
interface Sayable6
{
	void say(String msg); //Abstract method
	//It can contain any number of Object class methods
	int hashCode();
	String toString();
	boolean equals(Object obj);
}
public class FunctionInterfaceExample2 implements Sayable6
{
	public void say(String msg)
	{
		System.out.println(msg);
	}
	public static void main(String[] args)
	{
		FunctionInterfaceExample2 fie=new FunctionInterfaceExample2();
		fie.say("Hello");
	}
}