package java_inner_class.inner_class;
abstract class Person //We can even have non-abstract class
{
	abstract void display(); //We can even have non-abstract method
}
public class AnonymousInnerClassExample1
{
	public static void main(String[]args)
	{
		Person obj=new Person(){
			void display()
			{
				System.out.println("Printing from Anonymous Inner Class");
			}
		};
		obj.display();
	}
}
