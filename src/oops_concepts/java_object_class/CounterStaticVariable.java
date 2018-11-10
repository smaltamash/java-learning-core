package oops_concepts.java_object_class;
public class CounterStaticVariable
{
	static int count=0; //will get memory only once in class area at time of class loading and retain its value
	CounterStaticVariable()
	{
		count++;
		System.out.println(count);
	}
	public static void main(String[] args)
	{
		CounterStaticVariable obj1=new CounterStaticVariable();
		CounterStaticVariable obj2=new CounterStaticVariable();
		CounterStaticVariable obj3=new CounterStaticVariable();
	}
}