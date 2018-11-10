package oops_concepts.java_object_class;
// THIS KEYWORD CAN BE USED TO RETURN CURRENT CLASS INSTANCE
class A3
{
	A3 getA3()
	{
		return this;
	}
	void msg()
	{
		System.out.println("Hello");
	}
}
public class ThisKeywordToReturnCurrentClassInstance
{
	public static void main(String[] args)
	{
		new A3().getA3().msg();
	}
}