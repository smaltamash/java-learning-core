package java_collections.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Comparator;
class Student3
{
	int rollno;
	String name;
	int age;
	Student3(int rollno,String name,int age)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
}
class AgeComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Student3 s1=(Student3)o1;
		Student3 s2=(Student3)o2;
		if(s1.age==s2.age)
		{
			return 0;
		}
		else if(s1.age>s2.age)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
class NameComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Student3 s1=(Student3)o1;
		Student3 s2=(Student3)o2;
		return s1.name.compareTo(s2.name);
	}
}
public class ComparatorExampleNonGenericExample
{
	public static void main(String[] args)
	{
		ArrayList list=new ArrayList();
		list.add(new Student3(101,"Seema",23));
		list.add(new Student3(106,"Olly",27));
		list.add(new Student3(105,"Esha",21));
		System.out.println("Sorting by Age...");
		Collections.sort(list,new AgeComparator());
		Iterator itr1=list.iterator();
		while(itr1.hasNext())
		{
			Student3 st=(Student3)itr1.next();
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
		System.out.println("Sorting by Name...");
		Collections.sort(list,new NameComparator());
		Iterator itr2=list.iterator();
		while(itr2.hasNext())
		{
			Student3 st=(Student3)itr2.next();
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}

	}
}