package oops_concepts.java_abstraction;
abstract class Bike
{
	abstract void run();
}
public class AbstractClass extends Bike
{
	void run()
	{
		System.out.println("Running");
	}
	public static void main(String[] args)
	{
		//Bike obj=new Bike(); //Abstract Class can not be Instantiated 
		Bike obj=new AbstractClass();
		obj.run();
	}
}

/*
   If there is an abstract method in class
   then that class has to be abstract class else there will be compile time error.
   If you make a class that extends an abstract class, then you need to provide implementation of 
   all abstract method in current class present in parent class or you need to make current class also as
   abstract or else it will give compile time error
*/   
   
   