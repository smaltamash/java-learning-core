package java_conversion.conversion;
public class IntToCharExample2
{
	public static void main(String[] args)throws Exception
	{
		int a=1;
		char c=(char)a;
		System.out.println(c);
	}
}
//If you store 1, it will store ASCII character of given number which is start of heading which is not printable. So it will not print anything on the console(See ASCII Table).