package oops_concepts.java_polymorphism;
// STATIC BINDING
public class StaticBinding 
{
	private void eat()
	{
		System.out.println("Dog is Eating");
	} 
	public static void main(String[] args)
	{
		StaticBinding obj=new StaticBinding(); //Static Binding
		obj.eat();  
	}
}
