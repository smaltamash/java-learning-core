package oops_concepts.java_object_class;
class A2
{
	int a=8;
	A2()
	{
		this(5);
		System.out.println("Hello A2");
	}
	A2(int x)
	{
		System.out.println(x);
    }
}
public class ThisKeywordToInvokeCurrentClassConstructor2
{
	public static void main(String args[])
	{
		A2 a=new A2();
	}
}
