package basics_of_java.control_statements;
//FALL-THROW
public class SwitchFlowThrow 
{
	public static void main(String[] args)
	{
		int no=20;
		switch(no)
		{
			case 10:System.out.println("10");
			case 20:System.out.println("20");
			case 30:System.out.println("30");
			default:System.out.println("Not");
		}
	}
}
/* 
   switch statement is fall-through,
   it executes all statements after just match if break
   statement is not used in case statement.(first match)
 */ 
