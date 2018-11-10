package java_collections.collections;
import java.util.HashSet;
import java.util.Iterator;
class Book4
{
	int id;
	String name,author,publisher;
	int quantity;
	public Book4(int id,String name,String author,String publisher,int quantity)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
}
public class HashSetExample2
{
	public static void main(String[] args)
	{
		//Creating list of Book4s
		HashSet<Book4> list=new HashSet<Book4>();
		//Creating Book4s
		Book4 b1=new Book4(101,"Py C","Peepanshi","BPB",8);
		Book4 b2=new Book4(102,"DS","Jroza","Wiley",4);
		Book4 b3=new Book4(103,"Computation","Sanisha","Mc Graw",6);
		//Adding Book4s to HashSet
		list.add(b1);
		list.add(b2);
		list.add(b3);
		//Traversing HashSet
		for(Book4 b:list)
		{
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}
}
