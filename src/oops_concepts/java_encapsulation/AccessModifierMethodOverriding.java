package oops_concepts.java_encapsulation;
/*
class A2
{
	protected void msg()
	{
		System.out.println("Hello Java");
	}
}
public class AccessModifierMethodOverriding extends A2
{
	void msg() //Compile Time Error
	{
		System.out.println("Hello Java Overridden");
	}
	public static void main(String []args)
	{
		AccessModifierMethodOverriding obj=new AccessModifierMethodOverriding();
		obj.msg();
	}
}
*/

/*
   if you override any method, overridden method must not be more restictive,
   it can be less restrictive 
*/   

/*
class A
{
	protected void msg()
	{
		System.out.println("Hello Java");
	}
}
public class AccessModifierMethodOverriding extends A
{
	public void msg() //No Compile Time Error
	{
		System.out.println("Hello Java Overridden");
	}
	public static void main(String []args)
	{
		AccessModifierMethodOverriding obj=new AccessModifierMethodOverriding();
		obj.msg();
	}
}
*/