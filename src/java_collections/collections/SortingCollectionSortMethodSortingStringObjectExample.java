package java_collections.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class SortingCollectionSortMethodSortingStringObjectExample
{
	public static void main(String[] args)
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("Tanisha");
		list.add("Manisha");
		list.add("Aaniya");
		list.add("Heema");
		Collections.sort(list);
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}