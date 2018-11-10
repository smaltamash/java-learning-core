package java_collections.collections;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListAddAllMethodExample
{
	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>(); 
		al.add("Laiba");
		al.add("Crystal");
		al.add("Nahid");
		ArrayList<String> al2=new ArrayList<String>(); 
		al2.add("Kelly");
		al2.add("Brandy");
		al.addAll(al2);
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());	
		}
	}
}