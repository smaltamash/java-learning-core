package oops_concepts.java_object_class;
public class StaticBlock
{
	static
	{
		int a=20;
		System.out.println("Static Block is Invoked");
	}
	public static void main(String args[])
	{
		System.out.println("Hello Main");
	}
}
//static block is invoked before main method