package java_collections.collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
public class TreeMapRemoveMethodExample
{
	public static void main(String[] args)
	{
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(100,"Amisha");
		map.put(101,"Taniya");
		map.put(102,"Mansi");
		map.put(103,"Adeeba");
		System.out.println("Before Removing : "+map);
		//Remove Value for key 102
		map.remove(102);
		System.out.println("Values After Remove : "+map);
	}
}