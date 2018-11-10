package java_collections.collections;
import java.util.Set;
import java.util.EnumSet;
import java.util.Iterator;
enum Days2
{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}
public class EnumSetAllOfAndNoneOfMethodsExample
{
	public static void main(String[] args)
	{
		Set<Days2> set1=EnumSet.allOf(Days2.class);
	    System.out.println("Week Days2 : "+set1);
	    Set<Days2> set2=EnumSet.noneOf(Days2.class);
	    System.out.println("Week Days2 : "+set2);
	}
}