package oops_concepts.java_object_class;
// INITIALIZATION THROUGH REFERENCE VARIABLE
class Student2
{
	int id; 
	String name;
}
public class InitializingObject1 
{
	public static void main(String[] args)
	{
		Student2 s1=new Student2(); 
	    s1.id=101;
	    s1.name="Riya Aggarwal";
	    System.out.println(s1.id); 
	    System.out.println(s1.name);
	}
} 
