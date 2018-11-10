package oops_concepts.java_polymorphism;
interface Printable{}
class C implements Printable
{
	public void c()
	{
		System.out.println("Method c");
	}
}
class D implements Printable
{
	public void d()
	{
		System.out.println("Method d");
	}
}
class Call
{
	void invoke(Printable obj) //Upcasting
	{
		if(obj instanceof C)
		{
			C c=(C)obj; //Downcasting
		    System.out.println("Downcasting Performed");
		    c.c();
		}
		if(obj instanceof D)
		{
			D d=(D)obj; //Downcasting
			System.out.println("Downcasting Performed");
			d.d();
		}
	}
}
public class DowncastingRealUseExample
{
	public static void main(String[] args)
	{
		Printable p=new D();
		Call cobj=new Call();
		cobj.invoke(p);
	}
}
