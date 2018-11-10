package java_new_features.java_8_features;
import java.util.List;
import java.util.ArrayList;
public class LambdaExpressionExample5ForEachMethod
{
	public static void main(String []args)
	{
		List<String> list=new ArrayList<String>();
		list.add("Manisha");
		list.add("Ann");
		list.add("Heena");
		list.add("Garima");
		list.forEach(
				(n)->System.out.println(n)
				);
	}
}