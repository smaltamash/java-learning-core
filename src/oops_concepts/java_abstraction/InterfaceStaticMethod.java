package oops_concepts.java_abstraction;
interface Drawable3
{
	void draw();
	static int cube(int x)
	{
		return x*x*x;
	}
}
class Rectangle4 implements Drawable3
{
	public void draw()
	{
		System.out.println("Drawing Rectangle4");
	}
}
public class InterfaceStaticMethod
{
	public static void main(String args[])
	{
		Drawable3 obj=new Rectangle4();
		obj.draw();
		System.out.println(Drawable3.cube(5));
	}
}
//static methods were introduced in java 8