package basics_of_java.introduction;
// ++ and --
public class PrefixAndPostfix2 
{
	public static void main(String[] args)
	{
		int a=10;
		int b=10;
	    System.out.println(a++ + ++a); //10+12=33
	    System.out.println(a++ + a + ++a); //12+13+14=39
	    System.out.println(b++ + b++); //10+11=21	
	}
}
