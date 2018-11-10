package basics_of_java.control_statements;
public class SwitchExample 
{
	public static void main(String[] args)
	{
		int no=20;
		switch(no)
		{
			case 10:System.out.println("10");break;
			case 20:System.out.println("20");break;
			case 30:System.out.println("30");break;
			default:System.out.println("Not");
		}
	}
}

/*
class Program
{
	public static void main(String[] args)
	{
		int no=20;
		switch(no)
		{
			case 10:
			{
				System.out.println("10");
			}
			break;
			case 20:
			{
				System.out.println("20");
			}
			break;
			case 30:
			{
				System.out.println("30");
			}
			break;
			default:
			{
				System.out.println("Not");
			}
		}
	}
}
*/

