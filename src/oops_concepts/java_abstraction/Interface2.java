package oops_concepts.java_abstraction;
//Interface Decleration : by first user
interface Drawable
{
	void draw();
}
//Implementation : by second user
class Rectangle2 implements Drawable
{
	public void draw()
	{
		System.out.println("Drawable Rectangle2");
	}
}
class Circle2 implements Drawable
{
	public void draw()
	{
		System.out.println("Drawing Circle2");
	}
}
public class Interface2
{
	public static void main(String args[])
	{
		Drawable obj=new Circle2();
		//In Real Scenario, Object is provided by the method eg-getDrawable()
		obj.draw();
	}
}
