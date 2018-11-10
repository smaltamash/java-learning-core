package java_collections.collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
class Book9
{
	int id;
	String name,author,publisher;
	int quantity;
	public Book9(int id,String name,String author,String publisher,int quantity)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
}
public class HashMapExample2
{
	public static void main(String[] args)
	{
		//Creating map of Books
		Map<Integer,Book9> map=new HashMap<Integer,Book9>();
		//Creating Books
		Book9 b1=new Book9(101,"Py C","Zeenat","BPB",8);
		Book9 b2=new Book9(102,"DS","Faiza","Wiley",4);
		Book9 b3=new Book9(103,"Computation","Pooja","Mc Graw",6);
		//Adding Books to HashMap
		map.put(1,b1);
		map.put(2,b2);
		map.put(3,b3);
		//Traversing HashMap
		for(Map.Entry<Integer,Book9> entry:map.entrySet())
		{
			int key=entry.getKey();
			Book9 b=entry.getValue();
			System.out.println(key+" Details : ");
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}
}