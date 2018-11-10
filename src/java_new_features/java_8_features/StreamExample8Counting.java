package java_new_features.java_8_features;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
class Product8
{
	int id;
	String name;
	float price;
	public Product8(int id,String name,float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class StreamExample8Counting 
{
	public static void main(String[] args)
	{
		List<Product8> pList=new ArrayList<Product8>();
		//Adding Product8s
		pList.add(new Product8(1,"HP Laptop",25000f));
		pList.add(new Product8(2,"Dell Laptop",30000f));
		pList.add(new Product8(3,"Lenovo Laptop",28000f));
		pList.add(new Product8(4,"Sony Laptop",28000f));
		pList.add(new Product8(5,"Apple Laptop",90000f));
		//Count number of Product8s based on filters
		long count=pList.stream().filter(p->p.price<30000).count();
		System.out.println(count);
	}
}