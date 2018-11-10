package java_new_features.java_8_features;
//Importing StringJoiner class
import java.util.StringJoiner;
public class StringJoinerExample2AddingPrefixAndSuffix
{
	public static void main(String[] args)
	{
		StringJoiner joinNames=new StringJoiner(",","[","]"); //Passing comma(,) and square brackets as a Delimeter
		//Adding values to StringJoiner
		joinNames.add("Shivangi");
		joinNames.add("Heena");
		joinNames.add("Ishika");
		joinNames.add("Vineeta");
		System.out.println(joinNames);
	}
}