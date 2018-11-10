package basics_of_java.introduction;
// LOGICAL || AND BITWISE |
public class LogicalOR_and_BitwiseOR 
{
	public static void main(String[] args)
	{
		int a=10;
		int b=5;
		int c=20;
		System.out.println(a>b||a++<c); //true||true=true
	    System.out.println(a); //10 because second condition is not checked
	    System.out.println(a>b|a++<c); //true|true=true
	    System.out.println(a); //11 because second condition is checked
	}
}
