package java_new_features.java_7_features;
import java.util.List;
import java.util.ArrayList;
public class TypeInferenceForGenericsExample1
{
	public static void main(String []args)
	{
		//In Java 6 and earlier
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(12);
		for(Integer e:l1)
		{
			System.out.println(e);
		} 
		//In java 7 and onwards
		List<Integer> l2=new ArrayList<>(); //Here <> is used
		l2.add(23);
		for(Integer e:l2)
		{
			System.out.println(e);
		}
	}
}