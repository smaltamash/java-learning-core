package java_collections.collections;
import java.util.Set;
import java.util.TreeSet;
class Book6 implements Comparable<Book6>
{
	int id;
	String name,author,publisher;
	int quantity;
	public Book6(int id,String name,String author,String publisher,int quantity)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
	public int compareTo(Book6 b)
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
public class TreeSetExample2
{
	public static void main(String[] args)
	{
		//Creating set of Book6
		Set<Book6> set=new TreeSet<Book6>();
		//Creating Book6s
		Book6 b1=new Book6(101,"Py C","Peepanshi","BPB",8);
		Book6 b2=new Book6(102,"DS","Jroza","Wiley",4);
		Book6 b3=new Book6(103,"Computation","Sanisha","Mc Graw",6);
		//Adding Book6s to TreeSet
		set.add(b1);
		set.add(b2);
		set.add(b3);
		//Traversing TreeSet
		for(Book6 b:set)
		{
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}
}
