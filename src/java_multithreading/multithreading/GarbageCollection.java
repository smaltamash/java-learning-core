package java_multithreading.multithreading;
public class  GarbageCollection
{
	public void finalize()
	{
		System.out.println("Object is Garbage Collected");

	}
	public static void main(String[]args)
	{
		GarbageCollection obj1=new GarbageCollection();
		GarbageCollection obj2=new GarbageCollection();
		obj1=null;
		obj2=null;
		System.gc();
	}
}
