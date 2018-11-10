package java_new_features.java_9_features;
import java.util.stream.Stream;
public class StreamAPIImprovementExample5IterateMethod 
{
	public static void main(String args[])
	{
		Stream.iterate(1,i->i<=10,i->i*3)
		.forEach(System.out::println);
 	}
}