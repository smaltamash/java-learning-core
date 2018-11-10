package oops_concepts.java_polymorphism;
class Bike
{
	final int speedlimit; //Blank Final Variable
	Bike()
	{
		speedlimit=70; //if you comment it out it will give compile time error because fianl variables are not assigned any default value  
		System.out.println(speedlimit);
	}
}
public class BlankFinalVariables extends Bike
{
	public static void main(String[] args)
	{
		new BlankFinalVariables(); 
	}
}
// Blank Final variable can only be initialized inside a constructor