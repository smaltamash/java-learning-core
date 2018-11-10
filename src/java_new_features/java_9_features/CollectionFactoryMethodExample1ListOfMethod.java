package java_new_features.java_9_features;
import java.util.List;
public class CollectionFactoryMethodExample1ListOfMethod 
{
	public static void main(String args[])
	{
		List<String> list=List.of("Java","JavaFX","Spring","Hibernate","JSP");
		for(String l:list)
		{
			System.out.println(l);
		}
	}
}