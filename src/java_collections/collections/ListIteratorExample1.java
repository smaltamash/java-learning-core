package java_collections.collections;
import java.util.ArrayList;
import java.util.ListIterator;
public class ListIteratorExample1
{
	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("Esha");
		al.add("Laiba");
		al.add("Karishma");
		al.add(1,"Heena");
		System.out.println("Element at 2nd Position : "+al.get(2));
		ListIterator<String> itr=al.listIterator();
		System.out.println("Traversing Elements in forward direction...");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Traversing Elements in backward direction...");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
	}
}
