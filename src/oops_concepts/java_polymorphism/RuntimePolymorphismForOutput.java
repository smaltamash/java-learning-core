package oops_concepts.java_polymorphism;
class Animal5
{
	void eat()
	{
		System.out.println("eating.....");
	}
}
class Dog5 extends Animal5
{
	void eat()
	{
		System.out.println("Dog5 eating.....");
	}
}
public class RuntimePolymorphismForOutput extends Dog5
{
	public static void main(String[] args)
	{
		Animal5 obj=new RuntimePolymorphismForOutput();
		obj.eat(); //since eat() method is not overridden by RuntimePolymorphismForOutput so it calls the immediate parent class eat() method
	}
}
