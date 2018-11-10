package java_collections.collections;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;
class Book2
{
	int id;
	String name,author,publisher;
	int quantity;
	public Book2(int id,String name,String author,String publisher,int quantity)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
}
public class LinkedListExample2
{
	public static void main(String[] args)
	{
		//Creating list of Books
		List<Book2> list=new LinkedList<Book2>();
		//Creating Books
		Book2 b1=new Book2(101,"Let Us Learn","Deepanshi","BPB",8);
		Book2 b2=new Book2(102,"Data Communication","Froza","Wiley",4);
		Book2 b3=new Book2(101,"Sf Computation","Manisha","Mc Graw",6);
		//Adding Books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		//Traversing List
		for(Book2 b:list)
		{
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}
}