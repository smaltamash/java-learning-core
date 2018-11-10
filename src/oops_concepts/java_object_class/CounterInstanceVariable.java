package oops_concepts.java_object_class;
public class CounterInstanceVariable 
{
	int count=0; //will get memory when instance is created
	CounterInstanceVariable()
	{
		count++;
		System.out.println(count);
	}
	public static void main(String[] args)
	{
		CounterInstanceVariable obj1=new CounterInstanceVariable();
		CounterInstanceVariable obj2=new CounterInstanceVariable();
		CounterInstanceVariable obj3=new CounterInstanceVariable();
	}
}
