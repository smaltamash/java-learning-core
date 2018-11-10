package java_collections.collections;
//Non-Generic Map
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Iterator;
import java.util.Set;
public class MapNonGenericExample
{
	public static void main(String[] args)
	{
		Map map=new HashMap();
		map.put(100,"Amisha");
		map.put(101,"Taniya");
		map.put(102,"Mansi");
		map.put(103,"Adeeba");
		Set set=map.entrySet(); //Converting to Set so that we can Traverse
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			//Converting to Map.Entry so that we can get key and value separatly
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}