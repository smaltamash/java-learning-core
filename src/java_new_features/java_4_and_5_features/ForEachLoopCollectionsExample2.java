package java_new_features.java_4_and_5_features;
import java.util.ArrayList;
public class ForEachLoopCollectionsExample2
{
	public static void main(String args[])
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("Garima");
		al.add("Priya");
		al.add("Lisa");
		for(String s:al)
		{
			System.out.println(s);
		}	
	}
}