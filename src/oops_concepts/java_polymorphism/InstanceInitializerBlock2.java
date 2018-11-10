package oops_concepts.java_polymorphism;
class A2
{
    A2()
    {
    	System.out.println("Parent Class Constructor Invoked");
    }
}
public class InstanceInitializerBlock2 extends A2
{
	InstanceInitializerBlock2()
	{ 
		super(); //it will work same if we comment out or remove super() here
		System.out.println("Child Constructor is invoked");
	}
	{
		System.out.println("Instance Initializer block invoked");
	}
	public static void main(String[] args)
	{
		InstanceInitializerBlock2 obj=new InstanceInitializerBlock2(); 
	}
}
