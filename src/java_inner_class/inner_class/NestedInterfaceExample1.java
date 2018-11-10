package java_inner_class.inner_class;
interface Printable1
{
	interface Drawable
	{
		void draw();
	}
}
public class NestedInterfaceExample1 implements Printable1.Drawable
{ 
	public void draw()
	{
		System.out.println("Nested Interface");
	}
	public static void main(String[]args)
	{
		Printable1.Drawable obj=new NestedInterfaceExample1(); //Upcasting Here
		obj.draw();
	}
}