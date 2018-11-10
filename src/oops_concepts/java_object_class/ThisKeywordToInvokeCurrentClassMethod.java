package oops_concepts.java_object_class;
// THIS KEYWORD CAN BE USED TO INVOKE CURRENT CLASS METHOD
class A
{
	void m()
	{
		System.out.println("Hello M");
	}
	void n()
	{
		System.out.println("Hello N");
        //m(); //same as this.m(); becase compiler automatically adds this keyword if we do not add
		this.m();
	}
}
public class ThisKeywordToInvokeCurrentClassMethod
{
	public static void main(String args[])
	{
		A a=new A();
		a.n();
	}
}