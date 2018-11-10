package oops_concepts.java_polymorphism;
class Animal7{}
public class InstanceofOperator2 extends Animal
{
	public static void main(String[] args)
	{
		InstanceofOperator2 obj=new InstanceofOperator2(); 
		System.out.println(obj instanceof InstanceofOperator2);
		System.out.println(obj instanceof Animal);    
	}
}
