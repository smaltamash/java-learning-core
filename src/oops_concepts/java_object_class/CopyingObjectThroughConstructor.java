package oops_concepts.java_object_class;
public class CopyingObjectThroughConstructor 
{
	int id;
	String name;
	int age;
	CopyingObjectThroughConstructor(int i,String n)
	{
		id=i;
		name=n;
	}
	CopyingObjectThroughConstructor(CopyingObjectThroughConstructor obj)
	{
		id=obj.id;
		name=obj.name;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args)
	{
		CopyingObjectThroughConstructor obj1=new CopyingObjectThroughConstructor(11,"Aditi");
		CopyingObjectThroughConstructor obj2=new CopyingObjectThroughConstructor(obj1);
		obj1.display();
		obj2.display();
	}
}
/* There is no Copy Constructor in java like C++
   but we can copy one object to another using Constructor like Copy Constructor
*/    