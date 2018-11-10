package java_new_features.java_8_features;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;
class Product9
{
	int id;
	String name;
	float price;
	public Product9(int id,String name,float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class StreamExample9ConvertingListIntoSet 
{
	public static void main(String[] args)
	{
		List<Product9> pList=new ArrayList<Product9>();
		//Adding Product9s
		pList.add(new Product9(1,"HP Laptop",25000f));
		pList.add(new Product9(2,"Dell Laptop",30000f));
		pList.add(new Product9(3,"Lenovo Laptop",28000f));
		pList.add(new Product9(4,"Sony Laptop",28000f));
		pList.add(new Product9(5,"Apple Laptop",90000f));
		//Converting pList into Set
		Set<Float> pPriceSet=pList.stream()
		.filter(p->p.price<30000) //filtering Product9 on the base of price
		.map(p->p.price)
		.collect(Collectors.toSet()); //collect it as Set(remove duplicate elements)
		System.out.println(pPriceSet);
	}
}