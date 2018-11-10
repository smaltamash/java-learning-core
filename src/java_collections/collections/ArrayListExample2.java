package java_collections.collections;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListExample2
{
	public static void main(String[] args)
	{
		ArrayList<String> list=new ArrayList<String>(); 
		list.add("Ranjana");
		list.add("Vineeta");
		list.add("Saniya");
		list.add("Anjli");
		Iterator itr=list.iterator();
		for(String obj:list)
		{
			System.out.println(obj);
		}
	}
}