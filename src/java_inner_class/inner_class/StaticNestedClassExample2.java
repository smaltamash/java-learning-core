package java_inner_class.inner_class;
public class StaticNestedClassExample2
{ 
	static int data=83;
	static class StaticNestedClass
	{
		static void msg()
		{
			System.out.println("Instance method in Static Nested Class "+data);
		}
	}
	public static void main(String[]args)
	{
		StaticNestedClassExample2.StaticNestedClass.msg();
	}
}