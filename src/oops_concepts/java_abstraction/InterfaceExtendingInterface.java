package oops_concepts.java_abstraction;
interface Printable3
{
	void print();
}
interface Showable1 extends Printable3
{
	void show();
}
public class InterfaceExtendingInterface implements Showable1
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
		InterfaceExtendingInterface obj=new InterfaceExtendingInterface();
		obj.print();
		obj.show();
	}
}
