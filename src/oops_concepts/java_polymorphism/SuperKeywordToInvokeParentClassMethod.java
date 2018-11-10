package oops_concepts.java_polymorphism;
// THIS KEYWOR CAN BE USED TO INVOKE PARENT CLASS METHOD
class Animal1
{
	void eat()
	{
		System.out.println("eating.....");
	}
}
class Dog1 extends Animal1
{
	void eat()
	{
		System.out.println("eating bread.....");
	}
	void bark()
	{
		System.out.println("barking.....");
	}
	void work()
	{
		eat(); //child class method
		super.eat(); //Parent class method
		bark();
	}
}
public class SuperKeywordToInvokeParentClassMethod
{
	public static void main(String[] args)
	{
		Dog1 obj=new Dog1();
		obj.work(); 
	}
}