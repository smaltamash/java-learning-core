package oops_concepts.java_polymorphism;
class Adder1
{
	static int add(int a,int b)
	{
		return a+b;
	} 
	static double add(double a,double b)
	{
		return a+b;
	}
}
public class OverloadingWithChangingDataTypeOfArguments
{
	public static void main(String[] args)
	{
		System.out.println(Adder1.add(10,20));
		System.out.println(Adder1.add(10.89,20.30));
	}
}