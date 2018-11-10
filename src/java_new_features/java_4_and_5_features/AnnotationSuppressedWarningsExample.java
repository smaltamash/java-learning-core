package java_new_features.java_4_and_5_features;
import java.util.ArrayList;
public class AnnotationSuppressedWarningsExample
{
	@SuppressWarnings("unchecked")	
	public static void main(String[] args)
    {
    	ArrayList al=new ArrayList();
    	al.add("Saniya");
    	al.add("Katrina");
    	al.add("Pooja");
    	for(Object obj:al)
    	{
    		System.out.println(obj);
    	}
    }
}