package java_collections.collections;
import java.util.LinkedHashSet;
class Book5
{
	int id;
	String name,author,publisher;
	int quantity;
	public Book5(int id,String name,String author,String publisher,int quantity)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
}
public class LinkedHashSetExample2
{
	public static void main(String[] args)
	{
		//Creating list of Book5s
		LinkedHashSet<Book5> list=new LinkedHashSet<Book5>();
		//Creating Book5s
		Book5 b1=new Book5(101,"Py C","Farzana","BPB",8);
		Book5 b2=new Book5(102,"DS","Krozana","Wiley",4);
		Book5 b3=new Book5(103,"Computation","Tanisha","Mc Graw",6);
		//Adding Book5s to LinkedHashSet
		list.add(b1);
		list.add(b2);
		list.add(b3);
		//Traversing LinkedHashSet
		for(Book5 b:list)
		{
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}
}
