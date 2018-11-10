package java_inner_class.inner_class;
interface Printable 
{
	void display(); 
}
public class AnonymousInnerClassExample2
{
	public static void main(String[]args)
	{
		Printable obj=new Printable(){
			public void display()
			{
				System.out.println("Printing from Anonymous Inner Class");
			}
		};
		obj.display();
	}
}
 