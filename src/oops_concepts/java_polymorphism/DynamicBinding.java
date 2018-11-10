package oops_concepts.java_polymorphism;
// DYNAMIC BINDING
class Animal6
{
	void eat()
	{
		System.out.println("Animal eating.....");
	}
}
public class DynamicBinding extends Animal6
{
	void eat()
	{
		System.out.println("Dog is Eating");
	} 
	public static void main(String[] args)
	{
		Animal6 obj=new DynamicBinding(); //Dynamic Binding
		obj.eat();  
	}
}