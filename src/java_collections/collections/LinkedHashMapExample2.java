package java_collections.collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
class Book10
{
	int id;
	String name,author,publisher;
	int quantity;
	public Book10(int id,String name,String author,String publisher,int quantity)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
}
public class LinkedHashMapExample2
{
	public static void main(String[] args)
	{
		//Creating map of Books
		Map<Integer,Book10> map=new LinkedHashMap<Integer,Book10>();
		//Creating Books
		Book10 b1=new Book10(101,"Py C","Zeenat","BPB",8);
		Book10 b2=new Book10(102,"DS","Faiza","Wiley",4);
		Book10 b3=new Book10(103,"Computation","Pooja","Mc Graw",6);
		//Adding Books to LinkedHashMap
		map.put(2,b2);
		map.put(1,b1);
		map.put(3,b3);
		//Traversing LinkedHashMap
		for(Map.Entry<Integer,Book10> entry:map.entrySet())
		{
			int key=entry.getKey();
			Book10 b=entry.getValue();
			System.out.println(key+" Details : ");
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}
}