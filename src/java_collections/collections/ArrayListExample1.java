package java_collections.collections;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListExample1
{
	public static void main(String[] args)
	{
		ArrayList<String> list=new ArrayList<String>(); //Creating ArrayList
		list.add("Radhika"); //Adding objects in ArrayList
		list.add("Vineeta");
		list.add("Saniya");
		list.add("Anjli");
		//Traversing list through Iterator
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}