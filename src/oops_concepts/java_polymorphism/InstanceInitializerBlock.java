package oops_concepts.java_polymorphism;
public class InstanceInitializerBlock
{
	int speed;
	InstanceInitializerBlock()
	{
		System.out.println("Constructor is invoked");
	}
	{
		System.out.println("Instance Initializer block invoked");
	}
	public static void main(String[] args)
	{
		InstanceInitializerBlock obj=new InstanceInitializerBlock(); 
	}
}
/* In the above example, it seems that instance initializer block is firstly invoked but NO. 
   Instance intializer block is invoked at the time of object creation. 
   The java compiler copies the instance initializer block in the constructor after the first statement super(). 
   So firstly, constructor is invoked.
*/