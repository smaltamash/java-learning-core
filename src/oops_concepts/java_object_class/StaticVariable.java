package oops_concepts.java_object_class;
public class StaticVariable
{
	int rollno;
	String name;
	static String college="WHARTON";
	StaticVariable(int r,String n)
	{
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
	public static void main(String[] args)
	{
		StaticVariable obj1=new StaticVariable(23,"Heeba");
		StaticVariable obj2=new StaticVariable(28,"Nida");
		obj1.display();
		obj2.display();
	}
}
