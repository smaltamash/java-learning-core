package basics_of_java.control_statements;
public class BreakStatementExample 
{
	public static void main(String[] args)
	{
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.println(i);
		}
	}
} 
