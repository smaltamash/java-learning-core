package java_new_features.java_4_and_5_features;
import java.util.List;
import java.util.ArrayList;
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
public class GenericsExample5GenericWildcard
{
	//Creating a method that accept only child class of Shape
	public static void drawShapes(List<? extends Shape> lists)
	{
		for(Shape s:lists)
		{
			s.draw(); //Calling method of Shape calss by child class instance
		}
	}
	public static void main(String[] args)
    {
    	List<Rectangle> list1=new ArrayList<Rectangle>();
    	list1.add(new Rectangle());
    	List<Circle> list2=new ArrayList<Circle>();
    	list2.add(new Circle());
    	list2.add(new Circle());
    	drawShapes(list1);
    	drawShapes(list2);
    }
}