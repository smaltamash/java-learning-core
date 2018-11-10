package oops_concepts.java_polymorphism;
class Adder
{
	static int add(int a,int b)
	{
		return a+b;
	} 
	static int add(int a,int b,int c)
	{
		return a+b+c;
	}
}
public class OverloadingWithChangingNoOfArguments
{
	public static void main(String[] args)
	{
		System.out.println(Adder.add(10,20));
		System.out.println(Adder.add(10,20,30));
	}
}