package java_new_features.java_8_features;
interface Sayable4
{
	void say();
}
public class MethodReferenceExample5UsingInstanceMethodAndFunctionalInterface
{
	public void saySomething()
	{
		System.out.println("Hello, This is instance(non-static) method");
	}
	public static void main(String[] args)
	{
		MethodReferenceExample5UsingInstanceMethodAndFunctionalInterface methodReference=new MethodReferenceExample5UsingInstanceMethodAndFunctionalInterface(); //Creating Object
		//Referring to instance(non-static) method
		Sayable4 s1=methodReference::saySomething;
		//Calling interface method
		s1.say();
		//Referring instance(non-static) method using anonymous object
		Sayable4 s2=new MethodReferenceExample5UsingInstanceMethodAndFunctionalInterface()::saySomething; //You can use Anonymous object also
		//Calling interface method
		s2.say();
	}
}