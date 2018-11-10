package java_collections.collections;
import java.util.ArrayList;
public class ListExampleUsingArrayList
{
	public static void main(String args[])
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("Amisha");
		al.add("Jessica");
		al.add("Emma");
		al.add(1,"Daisy");
		System.out.println("Element at First Position : "+al.get(1));
		System.out.println("Element at Second Position : "+al.get(2));
		for(String s:al)
		{
			System.out.println(s);
		}
	}
}
