package java_collections.collections;
import java.util.Map;
import java.util.Hashtable;
import java.util.Map.Entry;
public class HashtableExample1
{
	public static void main(String[] args)
	{
		Hashtable<Integer,String> map=new Hashtable<Integer,String>();
		map.put(100,"Kuisha");
		map.put(101,"Laniya");
		map.put(102,"Priyansi");
		map.put(103,"Adeeba");
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}