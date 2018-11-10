package java_new_features.java_8_features;
import java.util.List;
import java.util.ArrayList;
class Product3
{
	int id;
	String name;
	float price;
	public Product3(int id,String name,float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
public class StreamExample1FilteringWithoutStream 
{
	public static void main(String[] args)
	{
		List<Product3> pList=new ArrayList<Product3>();
		//Adding Product3s
		pList.add(new Product3(1,"HP Laptop",25000f));
		pList.add(new Product3(2,"Dell Laptop",30000f));
		pList.add(new Product3(3,"Lenovo Laptop",28000f));
		pList.add(new Product3(4,"Sony Laptop",28000f));
		pList.add(new Product3(5,"Apple Laptop",90000f));
		List<Float> pPriceList=new ArrayList<Float>();
		for(Product3 p:pList)
		{
			//Filtering data of list
			if(p.price<30000)
			{
				pPriceList.add(p.price); //adding price to a pPriceList
			}
		}
		System.out.println(pPriceList); //Displaying data
	}
}
