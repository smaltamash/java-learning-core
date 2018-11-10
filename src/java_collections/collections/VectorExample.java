package java_collections.collections;
import java.util.Vector;
import java.util.Enumeration;
public class VectorExample
{
	public static void main(String[] args)
	{
		Vector<String> v=new Vector<String>(); //Creating Vector
		v.add("Anusha"); //Method of Collection
		v.addElement("Faiza"); //Method of Vector
		v.addElement("Katrina");
		v.addElement("Priya");
		//Traversing elements using Enumeration
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
}