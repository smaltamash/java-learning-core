package oops_concepts.inheritance_in_java;
// AGGREGATION HAS HAS-A RELATIONSHIP
class Operation
{
	int square(int n)
	{
		return n*n;
	}
}
public class Aggregation
{
	Operation op; //Aggregation
	double pi=3.14;
	double area(int radius)
	{
		op=new Operation();
		int rsquare=op.square(radius);
		//above code reusability(i.e. deligates the method call).
		return pi*rsquare;
	}
	public static void main(String[] args)
	{
		Aggregation obj=new Aggregation();
		double result=obj.area(5);
		System.out.println(result);
	}
}