package java_new_features.java_8_features;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Product1
{
	int id;
	String name;
	float price;
	public Product1(int id,String name,float price)
	{
		super();
		this.id=id;
		this.name=name;
		this.price=price;
	} 
}
public class LambdaExpressionExample8WithComparator
{
	public static void main(String []args)
	{
		List<Product1> list=new ArrayList<Product1>();
		//Adding Product1s
		list.add(new Product1(1,"HP Laptop",25000f));
		list.add(new Product1(3,"Keyboard",300f));
		list.add(new Product1(2,"Dell Mouse",150f));
		System.out.println("Sroting on the basis of name....");
		//Implementing Lambda Expression
		Collections.sort(list,(p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		for(Product1 p:list)
		{
			System.out.println(p.id+" "+p.name+" "+p.price);
		}
	}
}