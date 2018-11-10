package oops_concepts.java_abstraction;
abstract class Shape
{
	abstract void draw();
}
class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Rectangle");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Circle");
	}
}
public class AbstractClass2
{
	public static void main(String[] args)
	{
		/*
		They will not work
		Circle obj1=new Circle();
		Rectangle ob=(Rectangle)obj;
		Circle obj2=(Circle)new Rectangle()
		*/
        Shape obj=new Circle();
		obj.draw();
	}
}
