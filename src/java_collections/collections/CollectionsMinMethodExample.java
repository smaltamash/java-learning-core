package java_collections.collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class CollectionsMinMethodExample
{
	public static void main(String[] args)
	{
		List<Integer> list=new ArrayList<Integer>();
		list.add(79);
		list.add(87);
		list.add(56);
		list.add(46);
		list.add(32);
		list.add(22);
        System.out.println("Value of minimum element from the collection : "+Collections.min(list));	
	}
}