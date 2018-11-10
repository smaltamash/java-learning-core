package java_new_features.java_4_and_5_features;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
public class GenericsExample2
{
	public static void main(String[] args)
    {
    	HashMap<Integer,String> map=new HashMap<Integer,String>();
    	map.put(1,"Radhika");
    	map.put(4,"Lubna");
    	map.put(2,"Pooja");
    	//Now use Map.Entry for Set and Iterator
    	Set<Map.Entry<Integer,String>> set=map.entrySet();
    	Iterator<Map.Entry<Integer,String>> itr=set.iterator();
    	while(itr.hasNext())
    	{
    		Map.Entry e=itr.next(); //No need to type-cast
    		System.out.println(e.getKey()+" "+e.getValue());	
    	}
    }
}