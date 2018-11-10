package java_new_features.java_8_features;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
class Product16
{
	int id;
	String name;
	float price;
	public Product16(int id,String name,float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	} 
}
public class CollectorsExample3UsingSummingMethods
{
	public static void main(String[] args)
	{
		List<Product16> pList=new ArrayList<Product16>();
		//Adding Product16s
		pList.add(new Product16(1,"HP Laptop",25000f));
		pList.add(new Product16(2,"Dell Laptop",30000f));
		pList.add(new Product16(3,"Lenovo Laptop",28000f));
		pList.add(new Product16(4,"Sony Laptop",25000f));
		pList.add(new Product16(5,"Apple Laptop",90000f));
		Double sumPrices=pList.stream()
		.collect(Collectors.summingDouble(x->x.price)); //Collecting as List
		System.out.println("Sum of Prices : "+sumPrices);
		Integer sumId=pList.stream()
		.collect(Collectors.summingInt(x->x.id));
		System.out.println("Summing Id's : "+sumId);
	}
}