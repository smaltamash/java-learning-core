package java_new_features.java_4_and_5_features;
import java.util.ArrayList;
import java.util.Iterator;
public class GenericsExample1
{
	public static void main(String[] args)
    {
    	ArrayList<String> list=new ArrayList<String>();
    	list.add("Radhika");
    	list.add("Lubna");
    	//list.add(32); //Compile Time Error
    	String s=list.get(1); //type casting is not required
    	System.out.println("Element is : "+s);
    	Iterator<String> itr=list.iterator();
    	while(itr.hasNext())
    	{
    		System.out.println(itr.next());
    	}
    }
}