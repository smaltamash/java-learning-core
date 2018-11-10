package oops_concepts.java_object_class;
// PARAMETERIZED CONSTRUCTOR
public class ConstructorParameterized1 
{
	int id;
	String name;
	ConstructorParameterized1(int i,String n)
	{
		id=i;
		name=n;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args)
	{
		ConstructorParameterized1 obj1=new ConstructorParameterized1(11,"Kajal Gupta");
		ConstructorParameterized1 obj2=new ConstructorParameterized1(12,"Heena Khan");
		obj1.display();
		obj2.display();
	}
}
