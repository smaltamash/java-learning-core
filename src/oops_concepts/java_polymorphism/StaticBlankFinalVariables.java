package oops_concepts.java_polymorphism;
class Bike3
{
	final static int speedlimit2; //Static Blank Final Variable
	static
	{
		speedlimit2=120; //if you comment it out it will give compile time error because final variables are not assigned any default value  
		System.out.println(speedlimit2);
	}
}
public class StaticBlankFinalVariables extends Bike3
{
	public static void main(String[] args)
	{
		new StaticBlankFinalVariables(); 
	}
}
// Static Blank Final variable can only be initialized inside a static block