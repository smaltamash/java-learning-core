package basics_of_java.introduction;
// TERNARY OPERATOR
public class TernaryOperator 
{
	public static void main(String[] args)
	{
		int a=10;
		int b=5;
		//int age=8;
		int min=(a<b)?a:b;
		System.out.println(min);
		//(age>=18)?System.out.println("Adult"):System.out.println("Minor"); //not a statement
	}
}
//Ternary Operator can be nested aswell