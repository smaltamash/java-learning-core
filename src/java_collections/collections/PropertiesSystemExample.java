package java_collections.collections;
import java.util.Properties;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
public class PropertiesSystemExample
{
	public static void main(String[] args)throws Exception
	{
		Properties p=System.getProperties();
		Set set=p.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
	}
}