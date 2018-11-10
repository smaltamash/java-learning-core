package java_new_features.java_8_features;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
class Product
{
	int id;
	String name;
	float price;
	public Product(int id,String name,float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class StreamExample4FilteringAndIteratingCollection
{
	public static void main(String[] args)
	{
		List<Product> pList=new ArrayList<Product>();
		//Adding Products
		pList.add(new Product(1,"HP Laptop",25000f));
		pList.add(new Product(2,"Dell Laptop",30000f));
		pList.add(new Product(3,"Lenovo Laptop",28000f));
		pList.add(new Product(4,"Sony Laptop",28000f));
		pList.add(new Product(5,"Apple Laptop",90000f));
		pList.stream()
		.filter(p->p.price==30000)
		.forEach(p->System.out.println(p.name));
	}
}