package java_collections.collections;
import java.util.LinkedList;
import java.util.Iterator;
public class LinkedListExample1
{
	public static void main(String[] args)
	{
		LinkedList<String> list=new LinkedList<String>(); //Creating LinkedList
		list.add("Shweta"); //Adding objects in ArrayList
		list.add("Vishaka");
		list.add("Kajal");
		list.add("Anita");
		//Traversing list through Iterator
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}