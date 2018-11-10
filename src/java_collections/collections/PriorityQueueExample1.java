package java_collections.collections;
import java.util.PriorityQueue;	
import java.util.Iterator;
public class PriorityQueueExample1
{
	public static void main(String args[])
	{
		PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("Ameesha");
		queue.add("Maneesha");
		queue.add("Kajal");
		queue.add("Manpreet");
		queue.add("Divjot");
		System.out.println("head : "+queue.element());
		System.out.println("head : "+queue.peek());
		System.out.println("Iterating the queue Elements : ");
		Iterator itr=queue.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		queue.remove();
		queue.poll();
		System.out.println("after removing two elements : ");
		Iterator<String> itr2=queue.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
	}
}