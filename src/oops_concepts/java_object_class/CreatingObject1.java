package oops_concepts.java_object_class;
// MAIN IN SAME CLASS
public class CreatingObject1 
{
	int id; //field or data member or instance variable
	String name;
	public static void main(String[] args)
	{
		CreatingObject1 obj=new CreatingObject1(); //creating an object of CreateObject1 Class
     System.out.println(obj.id); //accessing member through reference variable
     System.out.println(obj.name);
	}
} 
/* 
Global Variables(Instance Variables) if not initialized contain default values,
when they are printed they print their data types default value,  
while the local variable need to be initialized or given value before they are printed
because the do not contain any default value,
if they are not given any value and printed they will give error
*/   
