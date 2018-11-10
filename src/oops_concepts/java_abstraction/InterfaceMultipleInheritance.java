package oops_concepts.java_abstraction;
interface Printable2
{
	void print();
}
interface Showable
{
	void show();
}
public class InterfaceMultipleInheritance implements Printable2,Showable
{
	public void print()
	{
		System.out.println("Print Method");
	}
	public void show()
	{
		System.out.println("Show Method");
	}
	public static void main(String args[])
	{
		InterfaceMultipleInheritance obj=new InterfaceMultipleInheritance();
		obj.print();
		obj.show();
	}
}
