package oops_concepts.java_polymorphism;
class Bike5
{
	int speedlimit=120;
}
public class RuntimePolymorphismNotByVariables extends Bike5
{
	int speedlimit=90;
	public static void main(String[] args)
	{
		Bike5 obj=new RuntimePolymorphismNotByVariables(); 
		System.out.println(obj.speedlimit); //Parent Class Variable
	}
}
//Runtime Polymorphism cannot be achieved by data members(variables) because they cannot be overridden