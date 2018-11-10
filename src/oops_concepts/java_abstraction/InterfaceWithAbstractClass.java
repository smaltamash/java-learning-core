package oops_concepts.java_abstraction;
//Creating Interface that has four methods
interface A1
{
	void a(); //by default public and abstract
	public abstract void b();
	void c();
	void d();
}
//Creating Abstract calss that provides implementation of one of the methods of A interface
abstract class B1 implements A1
{
	public void c()
	{
		System.out.println("Method c");
	}
	public abstract void b();
}
//Creating subclass of abstract class, now we need to provide the implementation of rest of the methods
class M1 extends B1
{
	public void a()
	{
		System.out.println("Method a");
	}
	public void b()
	{
		System.out.println("Method b");
	}
	public void d()
	{
		System.out.println("Method b");
	}
}
//Creating a class that calls all methods of interface A
public class InterfaceWithAbstractClass
{	
	public static void main(String args[])
	{
		A1 obj=new M1();
		obj.a();
		obj.b();
		obj.c();
		obj.d();
	}
}
