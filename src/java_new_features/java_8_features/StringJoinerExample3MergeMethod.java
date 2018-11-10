package java_new_features.java_8_features;
//Importing StringJoiner class
import java.util.StringJoiner;
public class StringJoinerExample3MergeMethod
{
	public static void main(String[] args)
	{
		StringJoiner joinNames1=new StringJoiner(",","[","]"); //Passing comma(,) and square brackets as a Delimeter
		//Adding values to first StringJoiner
		joinNames1.add("Shivangi");
		joinNames1.add("Heena");
		StringJoiner joinNames2=new StringJoiner(":","[","]"); //Passing colan(:) and square brackets as a Delimeter
		//Adding values to second StringJoiner
		joinNames2.add("Ishika");
		joinNames2.add("Vineeta");
		StringJoiner joinNames=joinNames1.merge(joinNames2);
		System.out.println(joinNames);
	}
}