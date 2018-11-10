package java_new_features.java_8_features;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
class Product11
{
	int id;
	String name;
	float price;
	public Product11(int id,String name,float price)
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
public class StreamExample11MethodReference 
{
	public static void main(String[] args)
	{
		List<Product11> pList=new ArrayList<Product11>();
		//Adding Product11s
		pList.add(new Product11(1,"HP Laptop",25000f));
		pList.add(new Product11(2,"Dell Laptop",30000f));
		pList.add(new Product11(3,"Lenovo Laptop",28000f));
		pList.add(new Product11(4,"Sony Laptop",28000f));
		pList.add(new Product11(5,"Apple Laptop",90000f));
		List<Float> pPriceList=pList.stream()
		.filter(p->p.price>30000) //Filtering data
		.map(Product11::getPrice) //fetching price by referring getPrice method
		.collect(Collectors.toList()); //Collecting as List
		System.out.println(pPriceList);
	}
}