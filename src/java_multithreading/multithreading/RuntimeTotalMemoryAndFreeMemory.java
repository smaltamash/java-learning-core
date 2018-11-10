package java_multithreading.multithreading;
import java.io.IOException;
public class  RuntimeTotalMemoryAndFreeMemory
{
	public static void main(String[]args) throws IOException
	{
		Runtime r=Runtime.getRuntime();
		System.out.println("Total Memory = "+r.totalMemory());
		System.out.println("Free Memory = "+r.freeMemory());
		for(int i=0;i<10000;i++)
		{
			new RuntimeTotalMemoryAndFreeMemory();
		}
		System.out.println("After Creating 10000 instances Free Memory = "+r.freeMemory());
        System.gc();
		System.out.println("After gc() Free Memory = "+r.freeMemory());
	}
}