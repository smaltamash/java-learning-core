package java_new_features.java_9_features;
import java.util.Set;
public class CollectionFactoryMethodExample2SetOfMethod 
{
	public static void main(String args[])
	{
		Set<String> set=Set.of("Java","JavaFX","Spring","Hibernate","JSP");
		for(String s:set)
		{
			System.out.println(s);
		}
	}
}