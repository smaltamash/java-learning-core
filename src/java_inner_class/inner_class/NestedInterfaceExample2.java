package java_inner_class.inner_class;
class A
{
	interface Drawable
	{
		void draw();
	}
}
public class NestedInterfaceExample2 implements A.Drawable
{ 
	public void draw()
	{
		System.out.println("Nested Interface");
	}
	public static void main(String[]args)
	{
		A.Drawable obj=new NestedInterfaceExample2(); //Upcasting Here
		obj.draw();
	}
}