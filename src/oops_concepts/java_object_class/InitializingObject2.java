package oops_concepts.java_object_class;
// INITIALIZATION THROUGH METHOD
class Student3
{
	int rollno; 
	String name;
	void insertRecord(int r, String n)
	{
		rollno=r;
		name=n;
	}
	void displayInformation()
	{
		System.out.println(rollno+" "+name);
	}
}
public class InitializingObject2 
{
	public static void main(String[] args)
	{
		Student3 s1=new Student3();
		Student3 s2=new Student3(); 
	    s1.insertRecord(111,"Ketty");
	    s2.insertRecord(222,"Anjli");
	    s1.displayInformation();
	    s2.displayInformation();
	}
} 
