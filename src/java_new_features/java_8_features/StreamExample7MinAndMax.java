package java_new_features.java_8_features;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
class Product7
{
	int id;
	String name;
	float price;
	public Product7(int id,String name,float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class StreamExample7MinAndMax 
{
	public static void main(String[] args)
	{
		List<Product7> pList=new ArrayList<Product7>();
		//Adding Product7s
		pList.add(new Product7(1,"HP Laptop",25000f));
		pList.add(new Product7(2,"Dell Laptop",30000f));
		pList.add(new Product7(3,"Lenovo Laptop",28000f));
		pList.add(new Product7(4,"Sony Laptop",28000f));
		pList.add(new Product7(5,"Apple Laptop",90000f));
		//max() method to get max Product7 price
		Product7 pA=pList.stream().max((p1,p2)->p1.price>p2.price?1:-1).get();
		System.out.println(pA.price);
		//min() method to get min Product7 price
		Product7 pB=pList.stream().min((p1,p2)->p1.price>p2.price?1:-1).get();
		System.out.println(pB.price);
	}
}
//We can use only min() or max() foe mina and max both by changing '>' sign 