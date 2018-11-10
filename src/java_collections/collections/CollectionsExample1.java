package java_collections.collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class CollectionsExample1
{
	public static void main(String[] args)
	{
		//Create and populate ArrayList
		List<String> list=new ArrayList<String>();
		list.add("Java");
		list.add("C");
		list.add("C++");	
		System.out.println("Initial Collection Value : "+list);
		Collections.addAll(list,"Servelet","JSP");
		System.out.println("After adding elements Collection value : "+list);
		String[] strArr={"C#",".Net"};	
		Collections.addAll(list,strArr);
		System.out.println("After adding array Collection values : "+list);
	}
}