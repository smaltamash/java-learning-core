package oops_concepts.java_oops_misc;
public class ObjectCloningByCloneableInterface implements Cloneable //Cloneable is a marked or tagged interface
{
	int rollno;
	String name;
	ObjectCloningByCloneableInterface(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	public Object clone()throws CloneNotSupportedException //you can also use protected Object clone()throws CloneNotSupportedException
	{
		return super.clone();
	}
	public static void main(String[] args)
	{
		try
		{
			ObjectCloningByCloneableInterface obj1=new ObjectCloningByCloneableInterface(101,"Shreya Aggarwal");
			ObjectCloningByCloneableInterface obj2=(ObjectCloningByCloneableInterface)obj1.clone(); //because obj1.clone() returns Object class object
            System.out.println(obj1+" "+obj2);
            System.out.println(obj1.rollno+" "+obj1.name);
            System.out.println(obj2.rollno+" "+obj2.name);
		}
		catch(CloneNotSupportedException c)
		{
			System.out.println(c);
		}
	}
}