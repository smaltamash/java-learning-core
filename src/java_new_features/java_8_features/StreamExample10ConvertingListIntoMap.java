package java_new_features.java_8_features;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
class Product10
{
	int id;
	String name;
	float price;
	public Product10(int id,String name,float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class StreamExample10ConvertingListIntoMap 
{
	public static void main(String[] args)
	{
		List<Product10> pList=new ArrayList<Product10>();
		//Adding Product10s
		pList.add(new Product10(1,"HP Laptop",25000f));
		pList.add(new Product10(2,"Dell Laptop",30000f));
		pList.add(new Product10(3,"Lenovo Laptop",28000f));
		pList.add(new Product10(4,"Sony Laptop",28000f));
		pList.add(new Product10(5,"Apple Laptop",90000f));
		//Converting pList into Map
		Map<Integer,String> pPriceMap=pList.stream().collect(Collectors.toMap(p->p.id,p->p.name));
		System.out.println(pPriceMap);
	}
}