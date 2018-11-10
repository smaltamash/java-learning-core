package java_collections.collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
public class TreeMapExample1
{
	public static void main(String[] args)
	{
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(100,"Amisha");
		map.put(101,"Taniya");
		map.put(102,"Mansi");
		map.put(103,"Adeeba");
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}