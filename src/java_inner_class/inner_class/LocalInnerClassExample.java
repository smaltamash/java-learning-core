package java_inner_class.inner_class;
public class LocalInnerClassExample
{
	void display()
	{
		class LocalInnerClass
		{
			int data=90; //Must be final till JDK 1.7 but non=final allowed from JDK 1.8
			void msg()
			{
				System.out.println("Printing from Local Inner Class "+data);
			}
			//static void msg1() //Local Inner Class cannot have static methods and variables
			//{
			//	System.out.println("Static Method in Local Inner Class");
			//}
		}
		LocalInnerClass obj=new LocalInnerClass();
		obj.msg();
		//LocalInner.msg1();
	}
	public static void main(String[]args)
	{
		LocalInnerClassExample obj=new LocalInnerClassExample();
		obj.display();
	}
}