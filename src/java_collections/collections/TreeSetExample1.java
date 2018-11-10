package java_collections.collections;
import java.util.TreeSet;
import java.util.Iterator;
public class TreeSetExample1
{
	public static void main(String[] args)
	{
		TreeSet<String> list=new TreeSet<String>(); //Creating TreeSet
		list.add("Ladhika"); //Adding objects in TreeSet
		list.add("Cineeta");
		list.add("Saniya");
		list.add("Pdnjli");
		//Traversing list through Iterator
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}