package oops_concepts.java_polymorphism;
public class OverloadingWithTypePromotion
{
	void sum(int a,long b)
	
	{
		System.out.println(a+b);
	} 
	void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String[] args)
	{
		OverloadingWithTypePromotion obj=new OverloadingWithTypePromotion();
		obj.sum(10,20); //now second int literal will be promoted to long implicitly
		obj.sum(10,20,30);
	}
}