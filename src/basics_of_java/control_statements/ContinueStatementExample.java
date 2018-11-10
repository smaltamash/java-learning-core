package basics_of_java.control_statements;
public class ContinueStatementExample 
{
	public static void main(String[] args)
	{
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
		}
     }
}
/* 
   it continues the flow of program from that part and skips the part left after it
   in case of inner it continues only the inner loop
*/
