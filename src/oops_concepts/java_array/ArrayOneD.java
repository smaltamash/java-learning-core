package oops_concepts.java_array;
public class ArrayOneD
{
	public static void main(String[] args)
	{
		int a[]=new int[5]; //decleration and initilization
		a[0]=10; //initilization
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		//printing array below
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}

/*
   We can Declare, Instantiate and Initialize an Array at the same time
   int a[]={2,3,25,11,44}; //Decleration, Instantiation and Initialization all at once
*/   