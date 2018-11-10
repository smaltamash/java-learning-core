package java_collections.collections;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Iterator;
class Book8
{
	int id;
	String name,author,publisher;
	int quantity;
	public Book8(int id,String name,String author,String publisher,int quantity)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
}
public class ArrayDequeExample2
{
	public static void main(String[] args)
	{
		//Creating ArrayDeque of Books
		Deque<Book8> deque=new ArrayDeque<Book8>();
		//Creating Books
		Book8 b1=new Book8(101,"Py C","Peepanshi","BPB",8);
		Book8 b2=new Book8(102,"DS","Jroza","Wiley",4);
		Book8 b3=new Book8(103,"Computation","Sanisha","Mc Graw",6);
		//Adding Books to ArrayDeque
		deque.add(b1);
		deque.add(b2);
		deque.add(b3);
		//Traversing ArrayDeque
		for(Book8 b:deque)
		{
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}
}
