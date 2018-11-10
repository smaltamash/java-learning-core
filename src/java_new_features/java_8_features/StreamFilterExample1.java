package java_new_features.java_8_features;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
class Product12
{
	int id;
	String name;
	float price;
	public Product12(int id,String name,float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public float getPrice()
	{
		return price;
	}
}
public class StreamFilterExample1 
{
	public static void main(String[] args)
	{
		List<Product12> pList=new ArrayList<Product12>();
		//Adding Product12s
		pList.add(new Product12(1,"HP Laptop",25000f));
		pList.add(new Product12(2,"Dell Laptop",30000f));
		pList.add(new Product12(3,"Lenovo Laptop",28000f));
		pList.add(new Product12(4,"Sony Laptop",28000f));
		pList.add(new Product12(5,"Apple Laptop",90000f));
		pList.stream()
		.filter(p->p.price>30000) //Filtering price
		.map(p->p.price) //Fetching price
		.forEach(System.out::println); //Iterating price 
	}
}