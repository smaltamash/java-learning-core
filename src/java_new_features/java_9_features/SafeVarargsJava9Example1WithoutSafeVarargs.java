package java_new_features.java_9_features;
import java.util.List;
import java.util.ArrayList;
public class SafeVarargsJava9Example1WithoutSafeVarargs 
{
	private void display(List<String>... products) //Not using @SafeVarargs
	{
		for(List<String> product:products)
		{
			System.out.println(product);
		}
    }
	public static void main(String args[])
	{
		SafeVarargsJava9Example1WithoutSafeVarargs p=new SafeVarargsJava9Example1WithoutSafeVarargs();
		List<String> list=new ArrayList<String>();
		list.add("Laptop");
		list.add("Tablet");
		p.display(list);
	}
}
//Run using Terminal or cmd