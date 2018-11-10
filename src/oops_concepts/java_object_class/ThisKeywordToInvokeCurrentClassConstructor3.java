package oops_concepts.java_object_class;
class Student
{
	int rollno=8;
	String name,course;
	float fee;
	Student(int rollno,String name,String course)
	{
		this.rollno=rollno;
		this.name=name;
		this.course=course;
	}
	Student(int rollno,String name,String course,float fee)
	{
		this(rollno,name,course); //reusing constructor
		this.fee=fee;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+course+" "+fee);
	}
}
public class ThisKeywordToInvokeCurrentClassConstructor3
{
	public static void main(String args[])
	{
		Student s1=new Student(123,"Ankita","Python");
		Student s2=new Student(123,"Shreya","C++",1231.90f);
		s1.display();
		s2.display();
	}
}

/*
   we cant use this() statements in methods other than Constructors 
   RULE:-
   Call to this() must be the first statement in the constructor or else it will give Compile Time Error
*/    