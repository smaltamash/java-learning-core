package basics_of_java.control_statements;
public class LabelledForLoop 
{
	public static void main(String[] args)
	{
		aa:
		for(int i=0;i<=3;i++)
		{
			bb:
			for(int j=0;j<=3;j++)
			{
				if(i==2&&j==2)
				{
					break aa;
				}
				System.out.println(i+" "+j);
			}
		} 
	}
}
/* if you use break bb; it will break the inner loop
   only which is the default behaviour of any loop
*/
