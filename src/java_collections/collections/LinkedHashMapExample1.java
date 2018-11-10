package java_collections.collections;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
public class LinkedHashMapExample1
{
	public static void main(String[] args)
	{
		LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();
		map.put(100,"Oisha");
		map.put(101,"Rani");
		map.put(102,"Kansi");
		map.put(103,"Ladeeba");
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}