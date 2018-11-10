package java_new_features.java_8_features;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
class Product5
{
	int id;
	String name;
	float price;
	public Product5(int id,String name,float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class StreamExample5ReduceMethod 
{
	public static void main(String[] args)
	{
		List<Product5> pList=new ArrayList<Product5>();
		//Adding Product5s
		pList.add(new Product5(1,"HP Laptop",25000f));
		pList.add(new Product5(2,"Dell Laptop",30000f));
		pList.add(new Product5(3,"Lenovo Laptop",28000f));
		pList.add(new Product5(4,"Sony Laptop",28000f));
		pList.add(new Product5(5,"Apple Laptop",90000f));
		//This is more compact approach of filtering data
		Float totalPrice=pList.stream()
		.map(p->p.price)
		.reduce(0.0f,(sum,price)->sum+price); //Accumulating price
		System.out.println(totalPrice);
		//More precise code
		float totalPrice2=pList.stream()
		.map(p->p.price)
		.reduce(0.0f,Float::sum); //Accumulating price by reffering method of Float class
		System.out.println(totalPrice2);
	}
}