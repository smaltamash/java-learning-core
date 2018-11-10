package java_collections.collections;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
class Book12
{
	int id;
	String name,author,publisher;
	int quantity;
	public Book12(int id,String name,String author,String publisher,int quantity)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
}
public class HashtableExample2
{
	public static void main(String[] args)
	{
		//Creating map of Books
		Map<Integer,Book12> map=new Hashtable<Integer,Book12>();
		//Creating Books
		Book12 b1=new Book12(101,"Py C","Zeenat","BPB",8);
		Book12 b2=new Book12(102,"DS","Faiza","Wiley",4);
		Book12 b3=new Book12(103,"Computation","Pooja","Mc Graw",6);
		//Adding Books to Hashtable
		map.put(1,b1);
		map.put(2,b2);
		map.put(3,b3);
		//Traversing Hashtable
		for(Map.Entry<Integer,Book12> entry:map.entrySet())
		{
			int key=entry.getKey();
			Book12 b=entry.getValue();
			System.out.println(key+" Details : ");
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}
}