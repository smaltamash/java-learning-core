package oops_concepts.java_object_class;
// CREATING MULTIPLE OBJECT BY ONE TYPE AND ANONYMOUS OBJECT
class Rectangle
{
	int length,width; 
	void insert(int l, int w)
	{
		length=l;
		width=w;
	}
	void calculateArea()
	{
		System.out.println(length*width);
	}
	void disp()
	{
		System.out.println("Hello");
	}
}
public class CreatingObject3 
{
	public static void main(String[] args)
	{
		Rectangle r1=new Rectangle(),r2=new Rectangle(); //Multiple Object by one type like variables int a=9,b=6;
		new Rectangle().disp(); //Anonymous Object
      r1.insert(11,5);
      r2.insert(3,15);
      r1.calculateArea();
      r2.calculateArea();
	}
}
