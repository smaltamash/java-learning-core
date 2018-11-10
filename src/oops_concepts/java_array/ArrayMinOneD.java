package oops_concepts.java_array;
public class ArrayMinOneD
{
	static int min(int arr[])
	{
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		return min;
	}
	public static void main(String[] args)
	{
		int arr[]={3,67,23,2,11,12};
		System.out.println(ArrayMinOneD.min(arr));
	}
}
