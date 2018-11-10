package java_conversion.conversion;
public class IntToCharForDigitMethodExample2
{
	public static void main(String[] args)throws Exception
	{
		int REDIX=16; //redix 16 is for hexadecimal number, for Decimal use redix 16
		int a=10;
		char c=Character.forDigit(a,REDIX);
		System.out.println(c);
	}
}

