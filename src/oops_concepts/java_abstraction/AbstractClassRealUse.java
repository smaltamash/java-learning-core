package oops_concepts.java_abstraction;
interface A
{
	void a();
	void b();
	void c();
	void d();
}
abstract class B implements A
{
	public void b()
	{
		System.out.println("function b");
	}
}
class M extends B
{
	public void a()
	{
		System.out.println("function a");
	}
	public void c()
	{
		System.out.println("function c");
	}
    public void d()
    {
    	System.out.println("function d");
    }
}
public class AbstractClassRealUse
{
	public static void main(String args[])
	{
		A obj=new M();
		obj.a();
		obj.b();
		obj.c();
		obj.d();
	}
}