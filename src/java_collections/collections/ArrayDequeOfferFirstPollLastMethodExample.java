package java_collections.collections;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
public class ArrayDequeOfferFirstPollLastMethodExample
{
	public static void main(String[] args)
	{
		Deque<String> deque=new ArrayDeque<String>(); //Creating ArrayDeque
		deque.add("Radhika"); //Adding objects in ArrayDeque
		deque.add("Vineeta");
		deque.add("Saniya");
		deque.add("Anjli");
		//Traversing deque through Iterator
		Iterator itr=deque.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}