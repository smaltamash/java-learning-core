package java_new_features.java_8_features;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
class Product4
{
	int id;
	String name;
	float price;
	public Product4(int id,String name,float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class StreamExample2FilterMethod 
{
	public static void main(String[] args)
	{
		List<Product4> pList=new ArrayList<Product4>();
		//Adding Products
		pList.add(new Product4(1,"HP Laptop",25000f));
		pList.add(new Product4(2,"Dell Laptop",30000f));
		pList.add(new Product4(3,"Lenovo Laptop",28000f));
		pList.add(new Product4(4,"Sony Laptop",28000f));
		pList.add(new Product4(5,"Apple Laptop",90000f));
		List<Float> pPriceList=pList.stream()
		.filter(p->p.price>30000) //Filtering data
		.map(p->p.price) //Fetching price
		.collect(Collectors.toList()); //Collecting as List
		System.out.println(pPriceList); 
	}
}