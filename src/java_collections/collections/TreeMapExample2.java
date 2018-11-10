package java_collections.collections;
import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;
class Book11
{
	int id;
	String name,author,publisher;
	int quantity;
	public Book11(int id,String name,String author,String publisher,int quantity)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
}
public class TreeMapExample2
{
	public static void main(String[] args)
	{
		//Creating map of Books
		Map<Integer,Book11> map=new TreeMap<Integer,Book11>();
		//Creating Books
		Book11 b1=new Book11(101,"Py C","Zeenat","BPB",8);
		Book11 b2=new Book11(102,"DS","Faiza","Wiley",4);
		Book11 b3=new Book11(103,"Computation","Pooja","Mc Graw",6);
		//Adding Books to TreeMap
		map.put(2,b2);
		map.put(1,b1);
		map.put(3,b3);
		//Traversing TreeMap
		for(Map.Entry<Integer,Book11> entry:map.entrySet())
		{
			int key=entry.getKey();
			Book11 b=entry.getValue();
			System.out.println(key+" Details : ");
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}
}