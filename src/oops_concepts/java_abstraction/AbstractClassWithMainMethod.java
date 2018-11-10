package oops_concepts.java_abstraction;
public abstract class AbstractClassWithMainMethod
{
	AbstractClassWithMainMethod()
	{
		System.out.println("Bike Created");
	}
	abstract void run();
	static void changeGear()
	{
		System.out.println("Gear Changed");
	}
	public static void main(String[] args)
	{
		AbstractClassWithMainMethod.changeGear();
	}
}
