package java_collections.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Comparator;
class Student4
{
	int rollno;
	String name;
	int age;
	Student4(int rollno,String name,int age)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
}
class AgeComparator2 implements Comparator<Student4>
{
	public int compare(Student4 s1,Student4 s2)
	{
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
class NameComparator2 implements Comparator<Student4>
{
	public int compare(Student4 s1,Student4 s2)
	{
		return s1.name.compareTo(s2.name);
	}
}
public class ComparatorExampleGenericExample
{
	public static void main(String[] args)
	{
		ArrayList<Student4> list=new ArrayList<Student4>();
		list.add(new Student4(101,"Seema",23));
		list.add(new Student4(106,"Amisha",27));
		list.add(new Student4(105,"Esha",21));
		System.out.println("Sorting by Age...");
		Collections.sort(list,new AgeComparator2());
		Iterator itr1=list.iterator();
		while(itr1.hasNext())
		{
			Student4 st=(Student4)itr1.next();
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
		System.out.println("Sorting by Name...");
		Collections.sort(list,new NameComparator2());
		Iterator itr2=list.iterator();
		while(itr2.hasNext())
		{
			Student4 st=(Student4)itr2.next();
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}

	}
}