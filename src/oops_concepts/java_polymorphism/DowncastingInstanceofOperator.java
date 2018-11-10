package oops_concepts.java_polymorphism;
class Parent{}
public class DowncastingInstanceofOperator extends Parent
{
	static void downcast(Parent obj)
	{
		if(obj instanceof DowncastingInstanceofOperator)
		{
			DowncastingInstanceofOperator ob=(DowncastingInstanceofOperator)obj;
			System.out.println("Downcasting Done");
		}
	}
	public static void main(String[] args)
	{
		Parent obj=new DowncastingInstanceofOperator();
        DowncastingInstanceofOperator.downcast(obj);
	}
}
/*
   Child obj=new Parent(); //Compile Time Error
   Child obj=(Child)new Parent(); //Successfully Compile but will give ClassCastException at runtime
*/