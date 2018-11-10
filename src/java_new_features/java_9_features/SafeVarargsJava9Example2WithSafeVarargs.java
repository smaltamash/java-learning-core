package java_new_features.java_9_features;
import java.util.List;
import java.util.ArrayList;
public class SafeVarargsJava9Example2WithSafeVarargs 
{
	@SafeVarargs
	private void display(List<String>... products) //Now using @SafeVarargs
	{
		for(List<String> product:products)
		{
			System.out.println(product);
		}
    }
	public static void main(String args[])
	{
		SafeVarargsJava9Example2WithSafeVarargs p=new SafeVarargsJava9Example2WithSafeVarargs();
		List<String> list=new ArrayList<String>();
		list.add("Laptop");
		list.add("Tablet");
		p.display(list);
	}
}