package java_new_features.java_8_features;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
class Product13
{
	int id;
	String name;
	float price;
	public Product13(int id,String name,float price)
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
public class StreamFilterExample2 
{
	public static void main(String[] args)
	{
		List<Product13> pList=new ArrayList<Product13>();
		//Adding Product13s
		pList.add(new Product13(1,"HP Laptop",25000f));
		pList.add(new Product13(2,"Dell Laptop",30000f));
		pList.add(new Product13(3,"Lenovo Laptop",28000f));
		pList.add(new Product13(4,"Sony Laptop",28000f));
		pList.add(new Product13(5,"Apple Laptop",90000f));
		List<Float>pPriceList=pList.stream()
		.filter(p->p.price>30000) //Filtering price
		.map(p->p.price) //Fetching price
		.collect(Collectors.toList()); //Collecting as a List
		System.out.println(pPriceList); 
	}
}