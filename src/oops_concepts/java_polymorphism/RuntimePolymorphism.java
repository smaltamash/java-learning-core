package oops_concepts.java_polymorphism;
class Bike4
{
	void run()
	{
		System.out.println("Bike is Running");
	}
}
public class RuntimePolymorphism extends Bike4
{
	void run()
	{
		System.out.println("Running");
	}
	public static void main(String[] args)
	{
		Bike4 obj=new RuntimePolymorphism(); //Upcasting
		obj.run(); 
	}
}