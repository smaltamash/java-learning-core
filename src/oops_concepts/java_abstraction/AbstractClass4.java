package oops_concepts.java_abstraction;
abstract class Bike2
{
	Bike2()
	{
		System.out.println("Bike2 Created");
	}
	abstract void run();
	void changeGear()
	{
		System.out.println("Gear Changed");
	}
}
public class AbstractClass4 extends Bike2
{
	void run()
	{
		System.out.println("Running Safely");
	}
	public static void main(String[] args)
	{
		Bike2 obj=new AbstractClass4();
		obj.run();
		obj.changeGear();
	}
}
/*
   Abstract Class can have Constructors, Non-Abstract methods,
   Data Members,etc
   Abstract Class can even Have main() method
*/ 