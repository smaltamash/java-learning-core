package oops_concepts.java_abstraction;
interface Drawable2
{
	void draw();
	default void msg()
	{
		System.out.println("Default Method");
	}
}
class Rectangle3 implements Drawable2
{
	public void draw()
	{
		System.out.println("Drawing Rectangle3");
	}
}
public class InterfaceDefaultMethod
{
	public static void main(String args[])
	{
		Drawable2 obj=new Rectangle3();
		obj.draw();
		obj.msg();
	}
}
//Default methods were introduced in java since java 8
