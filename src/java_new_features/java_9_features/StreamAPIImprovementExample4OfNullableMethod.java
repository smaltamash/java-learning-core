package java_new_features.java_9_features;
import java.util.stream.Stream;
public class StreamAPIImprovementExample4OfNullableMethod
{
	public static void main(String args[])
	{
		Stream<Integer> val=Stream.ofNullable(null);	
		val.forEach(System.out::println);
 	}
}