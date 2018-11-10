package java_collections.collections;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetExample1
{
	public static void main(String[] args)
	{
		//Creating HashSet and adding Elements
		HashSet<String> list=new HashSet<String>();
		list.add("Nadhika");
		list.add("Oineeta");
		list.add("Aaniya");
		list.add("Panjli");
		//Traversing Elements
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}