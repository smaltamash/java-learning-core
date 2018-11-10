package java_new_features.java_8_features;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
class Product18
{
	int id;
	String name;
	float price;
	public Product18(int id,String name,float price)
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
public class CollcetorsExample5CountingElements
{
	public static void main(String[] args)
	{
		List<Product18> pList=new ArrayList<Product18>();
		//Adding Product18s
		pList.add(new Product18(1,"HP Laptop",25000f));
		pList.add(new Product18(2,"Dell Laptop",30000f));
		pList.add(new Product18(3,"Lenovo Laptop",28000f));
		pList.add(new Product18(4,"Sony Laptop",25000f));
		pList.add(new Product18(5,"Apple Laptop",90000f));
		Long noOfElements=pList.stream() //We can even use long noOfElements=pList.stream()
		.collect(Collectors.counting());
		System.out.println("Total Elements : "+noOfElements);
	}
}