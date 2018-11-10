package java_new_features.java_8_features;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
class Product2
{
	int id;
	String name;
	float price;
	public Product2(int id,String name,float price)
	{
		super();
		this.id=id;
		this.name=name;
		this.price=price;
	} 
}
public class LambdaExpressionExample9FilterCollectionDataUsingLambdaExpression
{
	public static void main(String []args)
	{
		List<Product2> list=new ArrayList<Product2>();
		//Adding Product2s
		list.add(new Product2(1,"Samsung A5",17000f));
		list.add(new Product2(3,"iPhone X",150000f));
		list.add(new Product2(2,"Sony Eperia",25000f));
		list.add(new Product2(4,"Nokia Lumia",15000f));
		list.add(new Product2(5,"Redmi 4",26000f));
		list.add(new Product2(6,"Lenvo Vibe",19000f));
		//Using lambda Expression to filter the data
		Stream<Product2> filteredData=list.stream().filter(p->p.price>20000);
		//Using Lambda Expression to iterate through collection
		filteredData.forEach(
			Product2->System.out.println(Product2.name+" : "+Product2.price));
	}
}