package java_new_features.java_8_features;
interface Sayable
{
	void say();
}
public class MethodReferenceExample1UsingStaticMethodAndFunctionalInterface
{
	public static void saySomething()
	{
		System.out.println("Hello, this is static method.");
	}
	public static void main(String[] args)
	{
		//Referring static method
		Sayable s=MethodReferenceExample1UsingStaticMethodAndFunctionalInterface::saySomething;
		//calling interface method
		s.say();
	}
}