package java_collections.collections;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;
class Book3
{
	int id;
	String name,author,publisher;
	int quantity;
	public Book3(int id,String name,String author,String publisher,int quantity)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
}
public class ListExampleBook3
{
	public static void main(String[] args)
	{
		//Creating list of Books
		List<Book3> list=new LinkedList<Book3>();
		//Creating Books
		Book3 b1=new Book3(101,"Let C","Reepanshi","BPB",8);
		Book3 b2=new Book3(102,"Data Communication","Groza","Wiley",4);
		Book3 b3=new Book3(103,"Sf Computation","Wanisha","Mc Graw",6);
		//Adding Books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		//Traversing List
		for(Book3 b:list)
		{
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}
}
