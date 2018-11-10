package oops_concepts.java_polymorphism;
class Bank1
{
	float getRateOfInterest()
	{
		return 0.0f;
	}
}
class SBI1 extends Bank1
{
	float getRateOfInterest()
	{
		return 8.4f;
	}
}
class ICICI1 extends Bank1
{
	float getRateOfInterest()
	{
		return 7.3f;    
	}
}
class AXIS1 extends Bank1
{
	float getRateOfInterest()
	{
		return 9.7f;
	}
}
public class RuntimePolymorphism2
{
	public static void main(String[] args)
	{
		Bank1 obj;
		obj=new SBI1();
		System.out.println("Rate of Interest Of SBI = "+obj.getRateOfInterest());
		obj=new ICICI1();
		System.out.println("Rate of Interest Of ICICI = "+obj.getRateOfInterest());
		obj=new AXIS1();
		System.out.println("Rate of Interest Of AXIS = "+obj.getRateOfInterest());
	}
}