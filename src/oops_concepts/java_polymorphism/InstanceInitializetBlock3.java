package oops_concepts.java_polymorphism;
class A3
{
    A3()
    {
    	System.out.println("Parent Class Constructor Invoked");
    }
}
public class InstanceInitializetBlock3 extends A3
{
	InstanceInitializetBlock3()
	{ 
		super();
		System.out.println("Child Constructor is invoked");
	}
	InstanceInitializetBlock3(int x)
	{
		super();
		System.out.println("Child Constructor is Invoked "+x);
	}
	{
		System.out.println("Instance Initializer block invoked");
	}
	public static void main(String[] args)
	{
		InstanceInitializetBlock3 obj1=new InstanceInitializetBlock3();
		InstanceInitializetBlock3 obj2=new InstanceInitializetBlock3(10); 
	}
}

/* Changes Made Below
class A
{
    //A()
    //{
    //	System.out.println("Parent Class Constructor Invoked");
    //}
}
public class InstanceInitializetBlock3 extends A
{
	//InstanceInitializetBlock3()
	//{ 
	//	super();
//		System.out.println("Child Constructor is invoked");
//	}
	//InstanceInitializetBlock3(int x)
	//{
		//super();
//		System.out.println("Child Constructor is Invoked "+x);
//	}
	{
		System.out.println("Instance Initializer block invoked");
	}
	public static void main(String[] args)
	{
		//InstanceInitializetBlock3 obj1=new InstanceInitializetBlock3();
		InstanceInitializetBlock3 obj2=new InstanceInitializetBlock3(); 
	}
}
*/