package java_new_features.java_8_features;
import java.util.stream.Stream;
public class StreamExample3Iteration 
{
	public static void main(String[] args)
	{
		Stream.iterate(1,element->element+1)
		.filter(element->element%5==0)
		.limit(5)
		.forEach(System.out::println);
	}
}