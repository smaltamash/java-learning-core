package oops_concepts.inheritance_in_java;
class Animal
{
	void eat()
	{
		System.out.println("eating.....");
	}
}
public class SingleInheritance extends Animal
{
	void bark()
	{
		System.out.println("barking.....");
	}
	public static void main(String[] args)
	{
		SingleInheritance obj=new SingleInheritance();
		obj.eat();
		obj.bark();
	}
}