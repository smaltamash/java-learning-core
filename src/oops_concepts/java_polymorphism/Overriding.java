package oops_concepts.java_polymorphism;
class Vehicle
{
	void run()
	{
		System.out.println("Vehicle is Running");
	}
}
public class Overriding extends Vehicle
{
	void run()
	{
		System.out.println("Bike is Running");
	}
	public static void main(String[] args)
	{
		Overriding obj=new Overriding();
		obj.run(); 
	}
}