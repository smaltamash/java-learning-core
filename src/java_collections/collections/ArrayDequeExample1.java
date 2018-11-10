package java_collections.collections;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
public class ArrayDequeExample1
{
	public static void main(String[] args)
	{
		Deque<String> deque=new ArrayDeque<String>(); 
		deque.offer("Kadhika"); //Adding objects in ArrayDeque
		deque.offer("Pineeta");
		deque.add("Saniya");
		deque.offerFirst("Anjli");
		System.out.println("After offerFirst() Traversal...");
		for(String s:deque)
		{
			System.out.println(s);
		}
		//deque.poll();
		//deque.pollFirst();
		deque.pollLast();
		System.out.println("After pollLast() Traversal...");
		for(String s:deque)
		{
			System.out.println(s);
		}
	}
}