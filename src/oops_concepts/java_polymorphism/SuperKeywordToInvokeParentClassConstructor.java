package oops_concepts.java_polymorphism;
// SUPER KEYWORD CAN BE USED TO INVOKE PARENT CLASS CONSTRUCTOR
class Animal2
{
	Animal2()
	{
		System.out.println("Animal2");
	}
}
class Dog2 extends Animal2
{
	Dog2()
	{
		super(); //super() should be the first statement in constructor
		System.out.println("Dog2");
	}
}
public class SuperKeywordToInvokeParentClassConstructor
{
	public static void main(String[] args)
	{
		Dog2 obj=new Dog2(); 
	}
}

/* super() is added in each class constructor automatically by compiler
   if there is no super() or this() written before(previously).
   super() should be first statement always so super and this cannot be used together
   as both should be first statement.
*/