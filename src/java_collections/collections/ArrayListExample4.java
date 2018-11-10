package java_collections.collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
class Book
{
	int id;
	String name,author,publisher;
	int quantity;
	public Book(int id,String name,String author,String publisher,int quantity)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
}
public class ArrayListExample4
{
	public static void main(String[] args)
	{
		//Creating list of Books
		List<Book> list=new ArrayList<Book>();
		//Creating Books
		Book b1=new Book(101,"Let Us Learn","Daisy","BPB",8);
		Book b2=new Book(102,"Data Communication","Faiza","Wiley",4);
		Book b3=new Book(103,"Sf Computation","Kisa","Mc Graw",6);
		//Adding Books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		//Traversing List
		for(Book b:list)
		{
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}
}