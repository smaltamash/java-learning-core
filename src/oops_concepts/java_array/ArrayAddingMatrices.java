package oops_concepts.java_array;
public class ArrayAddingMatrices
{
	public static void main(String[] args)
	{
		//creating two matrices
		int a[][]={{1,2,3},{4,5,6}};
		int b[][]={{3,4,5},{5,6,7}};
		//creating another matrix to store addition of 2 matrices
		int c[][]=new int[2][3];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.println(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}