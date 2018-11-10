package oops_concepts.java_polymorphism;
class Animal3
{
	Animal3()
	{
		System.out.println("Animal3 is created");
	}
}
class Dog3 extends Animal3
{
	Dog3()
	{
		//super(); //super() should be the first statement in constructor
		//above statement is provided by compiler automatically as we have not provided
		System.out.println("Dog3 is created");
	}
}
public class SuperKeywordToInvokeParentClassConstructorByCompiler
{
	public static void main(String[] args)
	{
		Dog3 obj=new Dog3(); 
	}
}

/* super() is added in each class constructor automatically by compiler
   if there is no super() or this().
   super() should be first statement always so super and this cannot be used together
   as both should be first statement.
*/