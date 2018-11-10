package java_collections.collections;
import java.util.ArrayList;
import java.util.Iterator;
//Adding User-Defined Objects to the ArrayList
class Student
{
	int rollno;
	String name;
	int age;
	Student(int rollno,String name,int age)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
}
public class ArrayListExample3
{
	public static void main(String[] args)
	{
		//Creating User-Defined class objects
		Student s1=new Student(101,"Saniya",23);
		Student s2=new Student(102,"Rajni",21);
		Student s3=new Student(101,"Komal",25);
		//creating ArrayList
		ArrayList<Student> al=new ArrayList<Student>(); 
		al.add(s1);
		al.add(s2);
		al.add(s3);
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Student st=(Student)itr.next();
			System.out.println(st.rollno+" "+st.name+" "+st.age);	
		}
	}
}