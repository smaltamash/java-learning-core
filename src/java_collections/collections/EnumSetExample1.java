package java_collections.collections;
import java.util.Set;
import java.util.EnumSet;
import java.util.Iterator;
enum Days
{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}
public class EnumSetExample1
{
	public static void main(String[] args)
	{
		Set<Days> set=EnumSet.of(Days.TUESDAY,Days.WEDNESDAY);
	    //Traversing Elements
	    Iterator<Days> itr=set.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	}
}