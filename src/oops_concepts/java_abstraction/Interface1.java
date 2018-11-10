package oops_concepts.java_abstraction;
interface Printable
{
	void print();
}
public class Interface1 implements Printable
{
	public void print()
	{
		System.out.println("Hello");
	}
	public static void main(String args[])
	{
		Interface1 obj=new Interface1();
		obj.print();
	}
}
