package oops_concepts.java_array;
public class Array2D
{
	public static void main(String[] args)
	{
		//Declaring, Instantiating and Initializing 2D Array
		int arr[][]={{2,3,21},{4,5,45},{6,7,67}};
		//Printing 2D Array
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}

	}
}