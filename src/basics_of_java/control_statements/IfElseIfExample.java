package basics_of_java.control_statements;
public class IfElseIfExample 
{
	public static void main(String[] args)
	{
		int no=13;
		if(no%2==0)
		{
			System.out.println("Even No");
		}
		else if(no%2!=0)
		{
			System.out.println("Odd No");
		}
		else
		{
			System.out.println("Wrong Input");
		}
	}
}
