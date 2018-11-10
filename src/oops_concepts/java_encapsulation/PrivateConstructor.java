package oops_concepts.java_encapsulation;
class A1
{
	private A1()
	{
		System.out.println("Private Constructor");
	}
	void msg()
	{
		System.out.println("Hello Java");
	}
}
public class PrivateConstructor
{
	public static void main(String []args)
	{
		//A1 obj=new A1(); //Compile Time Error
	}
}
/*
   If you make any class constructor private,
   then you cannot create instance of that class from outside that class
   A class cannot be private or protected except nested class 
*/   