package oops_concepts.java_abstraction;
abstract class Bank
{
	abstract int getRateOfInterest();
}
class SBI extends Bank
{
	int getRateOfInterest()
	{
		return 7;
	}
}
class ICICI extends Bank
{
	int getRateOfInterest()
	{
		return 8;
	}
}
class PNB extends Bank 
{
	int getRateOfInterest()
	{
		return 5;
	}
}
public class AbstractClass3
{
	public static void main(String[] args)
	{
		/*
		They will not work
		Circle obj1=new Circle();
		Rectangle ob=(Rectangle)obj;
		Circle obj2=(Circle)new Rectangle()
		*/
        Bank obj;
		obj=new SBI();
		System.out.println("Rate Of Interest of SBI = "+obj.getRateOfInterest());
		obj=new ICICI();
		System.out.println("Rate Of Interest of SBI = "+obj.getRateOfInterest());
		obj=new PNB();
		System.out.println("Rate Of Interest of SBI = "+obj.getRateOfInterest());
	}
}
