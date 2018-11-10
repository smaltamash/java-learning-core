package java_new_features.java_8_features;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
class Product6
{
	int id;
	String name;
	float price;
	public Product6(int id,String name,float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class StreamExample6SummingDoubleMethodOfCollectorsClass 
{
	public static void main(String[] args)
	{
		List<Product6> pList=new ArrayList<Product6>();
		//Adding Product6s
		pList.add(new Product6(1,"HP Laptop",25000f));
		pList.add(new Product6(2,"Dell Laptop",30000f));
		pList.add(new Product6(3,"Lenovo Laptop",28000f));
		pList.add(new Product6(4,"Sony Laptop",28000f));
		pList.add(new Product6(5,"Apple Laptop",90000f));
		//Using Collectors method to sum the prices
		double tPrice=pList.stream()
		.collect(Collectors.summingDouble(p->p.price));
		System.out.println(tPrice);
	}
}