package java_new_features.java_9_features;
import java.util.Map;
public class CollectionFacetorMethodExample3MapOfMethod 
{
	public static void main(String args[])
	{
		Map<Integer,String> map=Map.of(101,"Java",102,"JavaFX",103,"Spring",104,"Hibernate",105,"JSP");
		for(Map.Entry<Integer,String> m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}