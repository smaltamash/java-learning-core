package java_new_features.java_8_features;
//Importing StringJoiner class
import java.util.StringJoiner;
public class StringJoinerExample1
{
	public static void main(String[] args)
	{
		StringJoiner joinNames=new StringJoiner(","); //Passing comma(,) as a Delimeter
		//Adding values to StringJoiner
		joinNames.add("Rakul");
		joinNames.add("Priyanka");
		joinNames.add("Radhika");
		joinNames.add("Sonia");
		System.out.println(joinNames);
	}
}