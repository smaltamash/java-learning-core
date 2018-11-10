package java_new_features.java_9_features;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StreamAPIImprovementExample3DropWhileMethodExample1 
{
	public static void main(String args[])
	{
		List<Integer> list=Stream.of(2,2,3,4,5,6,7,8,9,10)
		.dropWhile(i->(i%2==0))
		.collect(Collectors.toList());
		System.out.println(list);
 	}
}