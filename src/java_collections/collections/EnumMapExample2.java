package java_collections.collections;
import java.util.Map;
import java.util.EnumMap;
import java.util.Iterator;
class Book13
{
	int id;
	String name,author,publisher;
	int quantity;
	public Book13(int id,String name,String author,String publisher,int quantity)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
}
public class EnumMapExample2
{
	public enum Key
	{
		One,Two,Three
	};
	public static void main(String[] args)
	{
		//Creating map of Book13s
		EnumMap<Key,Book13> map=new EnumMap<Key,Book13>(Key.class);
		//Creating Book13s
		Book13 b1=new Book13(101,"Py C","Deepanshi","BPB",8);
		Book13 b2=new Book13(102,"DS","Jroza","Wiley",4);
		Book13 b3=new Book13(103,"Computation","Sanisha","Mc Graw",6);
		//Adding Book13s to EnumMap
		map.put(Key.One,b1);
		map.put(Key.Two,b2);
		map.put(Key.Three,b3);
		//Traversing EnumMap
		for(Map.Entry<Key,Book13> entry:map.entrySet())
		{
			Book13 b=entry.getValue();
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}
}
