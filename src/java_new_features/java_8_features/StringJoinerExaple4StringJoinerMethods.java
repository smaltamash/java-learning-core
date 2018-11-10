package java_new_features.java_8_features;
//Importing StringJoiner class
import java.util.StringJoiner;
public class StringJoinerExaple4StringJoinerMethods
{
	public static void main(String[] args)
	{
		StringJoiner joinNames=new StringJoiner(","); //Passing comma(,) as a Delimeter
		//Prints nothing because it is empty
		System.out.println(joinNames);
		//We can set default empty value
		joinNames.setEmptyValue("It is Empty"); 	
		System.out.println(joinNames);	
		//Adding values to StringJoiner
		joinNames.add("Seema");
		joinNames.add("Taniya");
		System.out.println(joinNames);
		//Returns length of StringJoiner
		int length=joinNames.length();
		System.out.println("Length : "+length);
		//Return StringJoiner as String type
		String str=joinNames.toString();
		System.out.println(str);
		//Now we can apply string methods on it
		char ch=str.charAt(3);
		System.out.println("Character at index 3 :"+ch);
		//Adding one more element
		joinNames.add("Sarika");
		//Returns length
		int newLength=joinNames.length();
		System.out.println("New Length : "+newLength);
		System.out.println(joinNames);
	}
}