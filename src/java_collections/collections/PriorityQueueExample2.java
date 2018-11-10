package java_collections.collections;
import java.util.Queue;
import java.util.PriorityQueue;
class Book7 implements Comparable<Book7>
{
	int id;
	String name,author,publisher;
	int quantity;
	public Book7(int id,String name,String author,String publisher,int quantity)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
	public int compareTo(Book7 b)
	{
		if(id>b.id)
		{
			return 1;
		}
		else if(id<b.id)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
public class PriorityQueueExample2
{
	public static void main(String[] args)
	{
		//Creating queue of Book7
		Queue<Book7> queue=new PriorityQueue<Book7>();
		//Creating Books
		Book7 b1=new Book7(101,"Py C","Peepanshi","BPB",8);
		Book7 b2=new Book7(102,"DS","Jroza","Wiley",4);
		Book7 b3=new Book7(103,"Computation","Sanisha","Mc Graw",6);
		//Adding Books to PriorityQueue
		queue.add(b1);
		queue.add(b2);
		queue.add(b3);
		//Traversing PriorityQueue
		for(Book7 b:queue)
		{
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
        queue.remove();
        System.out.println("After removing one book record");
        for(Book7 b:queue)
        {
        	System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
	}
}