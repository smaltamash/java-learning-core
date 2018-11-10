package java_collections.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
class Student2 implements Comparable<Student2>
{
	int rollno;
	String name;
	int age;
	Student2(int rollno,String name,int age)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	public int compareTo(Student2 st)
	{
		if(age==st.age)
		{
			return 0;
		}
		else if(age>st.age)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
public class ComparableInterfaceCompareToMethodExample
{
	public static void main(String[] args)
	{
		ArrayList<Student2> list=new ArrayList<Student2>();
		list.add(new Student2(101,"Warida",23));
		list.add(new Student2(106,"Anjli",27));
		list.add(new Student2(105,"Jessica",21));
		Collections.sort(list);
		for(Student2 st:list)
		{
			System.out.println(st.rollno+" "+st.name+" "+st.age);	
		}
	}
}