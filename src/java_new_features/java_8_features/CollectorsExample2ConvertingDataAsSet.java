package java_new_features.java_8_features;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
class Product15
{
	int id;
	String name;
	float price;
	public Product15(int id,String name,float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	} 
}
public class CollectorsExample2ConvertingDataAsSet
{
	public static void main(String[] args)
	{
		List<Product15> pList=new ArrayList<Product15>();
		//Adding Product15s
		pList.add(new Product15(1,"HP Laptop",25000f));
		pList.add(new Product15(2,"Dell Laptop",30000f));
		pList.add(new Product15(3,"Lenovo Laptop",28000f));
		pList.add(new Product15(4,"Sony Laptop",25000f));
		pList.add(new Product15(5,"Apple Laptop",90000f));
		Set<Float> pPriceSet=pList.stream()
		.map(x->x.price)
		.collect(Collectors.toSet()); //Collecting as Set
		System.out.println(pPriceSet);
	}
}