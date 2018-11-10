package java_collections.collections;
import java.util.LinkedHashSet;
import java.util.Iterator;
public class LinkedHashSetExample1
{
	public static void main(String[] args)
	{
		LinkedHashSet<String> list=new LinkedHashSet<String>(); //Creating LinkedHashSet
		list.add("Dadhika"); //Adding objects in LinkedHashSet
		list.add("Wineeta");
		list.add("Taniya");
		list.add("Onjli");
		//Traversing list through Iterator
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}