package oops_concepts.java_polymorphism;
class Bank
{
	int getRateOfInterest()
	{
		return 0;
	}
}
class SBI extends Bank
{
	int getRateOfInterest()
	{
		return 8;
	}
}
class ICICI extends Bank
{
	int getRateOfInterest()
	{
		return 9;
	}
}
class AXIS extends Bank
{
	int getRateOfInterest()
	{
		return 7;
	}
}
public class OverridingRealWorldExampleBank
{
	public static void main(String[] args)
	{
		SBI sb=new SBI();
		ICICI ic=new ICICI();
		AXIS ax=new AXIS();
		System.out.println("Rate of Interest of SBI = "+sb.getRateOfInterest());
		System.out.println("Rate of Interest of ICICI = "+ic.getRateOfInterest());
		System.out.println("Rate of Interest of AXIS = "+ax.getRateOfInterest()); 
	}
}
