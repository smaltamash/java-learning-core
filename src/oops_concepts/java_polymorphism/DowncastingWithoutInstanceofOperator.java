package oops_concepts.java_polymorphism;
class Parent1{}
public class DowncastingWithoutInstanceofOperator extends Parent1
{
	static void downcast(Parent1 obj)
	{
		DowncastingWithoutInstanceofOperator ob=(DowncastingWithoutInstanceofOperator)obj;
		System.out.println("Downcasting Done");
	}
	public static void main(String[] args)
	{
		Parent1 obj=new DowncastingWithoutInstanceofOperator();
		DowncastingWithoutInstanceofOperator.downcast(obj);
	}
}
