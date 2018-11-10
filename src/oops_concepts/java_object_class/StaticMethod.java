package oops_concepts.java_object_class;
public class StaticMethod
{
	int rollno;
	String name;
	static String college="PENN";
	static void change()
	{
		college="YALE";
	}
	StaticMethod(int r,String n)
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
		StaticMethod.change();
		StaticMethod obj1=new StaticMethod(78,"Seema");
		StaticMethod obj2=new StaticMethod(9,"Dimple");
		StaticMethod obj3=new StaticMethod(2,"Sheetal");
		obj1.display();
		obj2.display();
		obj3.display();
	}
}