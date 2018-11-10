package java_new_features.java_9_features;
import java.util.Map;
public class CollectionFactoryMethodExample4MapOfEntriesMethod 
{
	public static void main(String args[])
	{
		//Creating Map.Entry
		Map.Entry<Integer,String> e1=Map.entry(101,"Java");
		Map.Entry<Integer,String> e2=Map.entry(102,"Spring");
		//Creating Map using Map.Entry
		Map<Integer,String> map=Map.ofEntries(e1,e2);
		//Iterating Map
		for(Map.Entry<Integer,String> m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}