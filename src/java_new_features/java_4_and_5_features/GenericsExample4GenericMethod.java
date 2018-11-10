package java_new_features.java_4_and_5_features;
public class GenericsExample4GenericMethod
{
	//Creating Generic Method
	public static<E> void printArray(E[] elements)
	{
		for(E element:elements)
		{
			System.out.println(element);
		}
		System.out.println();
	}
	public static void main(String[] args)
    {
    	Integer[] intArray={10,20,30,40,50};
    	Character[] charArray={'A','S','H','N','A'};
    	System.out.println("Printing Integer Array");
    	printArray(intArray);
    	System.out.println("Printing Character Array");
    	printArray(charArray);
    }
}