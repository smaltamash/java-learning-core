package java_inner_class.inner_class;
interface Printable3
{
	class Drawable
	{
		void draw()
		{
			System.out.println("Class in Interface");
		}
		static void draw2()
		{
			System.out.println("Class in Interface");
		}
	}
}
public class ClassInInterface extends Printable3.Drawable
{ 
	public static void main(String[]args)
	{
		Printable3.Drawable obj=new Printable3.Drawable();
		obj.draw();
		Printable3.Drawable.draw2();
	}
}