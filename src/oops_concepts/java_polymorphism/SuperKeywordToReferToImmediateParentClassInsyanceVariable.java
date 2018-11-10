package oops_concepts.java_polymorphism;
// SUPER KEYWORD CAN BE USED TO INVOKE CURRENT CLASS INSTANCE VARIABLE
class Animal
{
	String color="white";
}
class Dog extends Animal
{
	String color="black";
	void printColor()
	{
		System.out.println(color); //prints color of child class
		System.out.println(super.color); //prints color of parent class
	}
}
public class SuperKeywordToReferToImmediateParentClassInsyanceVariable
{
	public static void main(String[] args)
	{
		Dog obj=new Dog();
		obj.printColor(); 
	}
}