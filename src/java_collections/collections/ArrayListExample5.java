package java_collections.collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListExample5
{
	public static void main(String[] args)
	{
		List<String> al=new ArrayList<String>(); //CreatingArrayList
		al.add("Saniya"); //adding objects in ArrayList
		al.add("Farheen");
		al.add("Kajal");
		al.add("Pooja");
		//Traversing elements using Iterator
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}