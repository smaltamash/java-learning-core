package oops_concepts.java_polymorphism;
class Animal4
{
	void eat()
	{
		System.out.println("eating.....");
	}
}
class Dog4 extends Animal4
{
	void eat()
	{
		System.out.println("Dog4 eating.....");
	}
}
public class RuntimePolymorphismWithMultilevelInheritance extends Dog4
{
	void eat()
	{
		System.out.println("BabyDog eating.....");
	}
    public static void main(String[] args)
	{
		Animal4 obj1,obj2,obj3;
		obj1=new Animal4();
		obj2=new Dog4();
		obj3=new RuntimePolymorphismWithMultilevelInheritance();
		obj1.eat();
		obj2.eat();
		obj3.eat();
	}
}
//Runtime Polymorphism can be achieved by Multilevel Inheritance also