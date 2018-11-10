package java_collections.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class SortingCollectionSortMethodSortingWrapperClassObjectExample
{
	public static void main(String[] args)
	{
		ArrayList list=new ArrayList();
		list.add(Integer.valueOf(56));
		list.add(Integer.valueOf(34));
		list.add(Integer.valueOf(12));
		//list.add("Hello"); //try this
		list.add(44); //Internally will be converted into object as Integer.valueOf(44)
		Collections.sort(list);
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}