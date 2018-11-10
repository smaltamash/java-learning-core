package java_new_features.java_8_features;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
class Product17
{
	int id;
	String name;
	float price;
	public Product17(int id,String name,float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	} 
}
public class CollectorsExample4UsingAveragingMethods
{
	public static void main(String[] args)
	{
		List<Product17> pList=new ArrayList<Product17>();
		//Adding Product17s
		pList.add(new Product17(1,"HP Laptop",25000f));
		pList.add(new Product17(2,"Dell Laptop",30000f));
		pList.add(new Product17(3,"Lenovo Laptop",28000f));
		pList.add(new Product17(4,"Sony Laptop",25000f));
		pList.add(new Product17(5,"Apple Laptop",90000f));
		Double avgDouble=pList.stream()
		.collect(Collectors.averagingDouble(p->p.price)); 
		System.out.println("Average Price is : "+avgDouble);
		Double avgInt=pList.stream()
		.collect(Collectors.averagingInt(p->p.id)); 
		System.out.println("Average Price is : "+avgInt);
	}
}