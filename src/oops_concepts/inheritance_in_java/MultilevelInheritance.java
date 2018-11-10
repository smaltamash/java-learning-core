package oops_concepts.inheritance_in_java;
class Animal1
{
	void eat()
	{
		System.out.println("eating.....");
	}
}
class Dog extends Animal1
{
	void bark()
	{
		System.out.println("barking.....");
	}
}
class BabyDog extends Dog
{
	void weep()
	{
		System.out.println("weeping.....");
	}
}
public class MultilevelInheritance
{
	public static void main(String[] args)
	{
		BabyDog obj=new BabyDog();
		obj.weep();
		obj.bark();
		obj.eat();
	}
}