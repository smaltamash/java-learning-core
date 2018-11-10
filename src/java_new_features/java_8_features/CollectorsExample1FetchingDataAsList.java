package java_new_features.java_8_features;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
class Product14
{
	int id;
	String name;
	float price;
	public Product14(int id,String name,float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	} 
}
public class CollectorsExample1FetchingDataAsList
{
	public static void main(String[] args)
	{
		List<Product14> pList=new ArrayList<Product14>();
		//Adding Product14s
		pList.add(new Product14(1,"HP Laptop",25000f));
		pList.add(new Product14(2,"Dell Laptop",30000f));
		pList.add(new Product14(3,"Lenovo Laptop",28000f));
		pList.add(new Product14(4,"Sony Laptop",25000f));
		pList.add(new Product14(5,"Apple Laptop",90000f));
		List<Float> pPriceList=pList.stream()
		.map(x->x.price)
		.collect(Collectors.toList()); //Collecting as List
		System.out.println(pPriceList);
	}
}