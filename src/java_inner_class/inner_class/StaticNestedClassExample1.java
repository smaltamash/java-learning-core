package java_inner_class.inner_class;
public class StaticNestedClassExample1
{ 
	static int data=8;
	static class StaticNestedClass
	{
		void msg()
		{
			System.out.println("Instance method in Static Nested Class "+data);
		}
	}
	public static void main(String[]args)
	{
		StaticNestedClassExample1.StaticNestedClass obj=new StaticNestedClassExample1.StaticNestedClass();
		obj.msg();
	}
}