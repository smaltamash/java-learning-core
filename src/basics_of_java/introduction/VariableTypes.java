package basics_of_java.introduction;
public class VariableTypes 
{
	int data=50; //Variable(Global/Instance)
	static int m=100; //Static Variable
	public static void main(String[] args)
	{
		//static int c=90; //Static Variable cant be a Local Variable because it is a class variable 
		int n=90; //Variable(Local)
		System.out.println(n);
	}
}
