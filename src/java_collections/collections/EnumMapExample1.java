package java_collections.collections;
import java.util.EnumMap;
import java.util.Map;
enum Days3 
{
	Monday,Tuesday,Wednesday,Thursday
};
//Creating Enum
public class EnumMapExample1
{
	public static void main(String[] args)
	{
		//Create and populate EnumMap
		EnumMap<Days3,String> map=new EnumMap<Days3,String>(Days3.class);
		map.put(Days3.Monday,"1");
		map.put(Days3.Tuesday,"2");
		map.put(Days3.Wednesday,"3");
		map.put(Days3.Thursday,"4");	
		//Print the Map
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}