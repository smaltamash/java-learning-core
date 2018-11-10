package java_collections.collections;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
public class ArrayListAndLinkedList
{    
	public static void main(String args[])
	{    
		List<String> list1=new ArrayList<String>();//creating ArrayList    
		list1.add("Gunjan");//adding object in ArrayList    
		list1.add("Heena");    
		list1.add("Aiysha");    
		list1.add("Manisha");    
		List<String> list2=new LinkedList<String>();//creating LinkedList    
		list2.add("Jessica");//adding object in :inkedList    
		list2.add("Serena");    
		list2.add("Swati");    
		list2.add("Kanika");    
		System.out.println("arraylist: "+list1);  
		System.out.println("linkedlist: "+list2);  
	}    
}    