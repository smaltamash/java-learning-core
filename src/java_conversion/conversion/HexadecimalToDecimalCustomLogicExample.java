package java_conversion.conversion;
public class HexadecimalToDecimalCustomLogicExample
{    
	public static int getDecimal(String hex)
	{  
		String digits = "0123456789ABCDEF";  
		hex = hex.toUpperCase();  
		int val = 0;  
		for (int i = 0; i < hex.length(); i++)  
		{  
			char c = hex.charAt(i);  
			int d = digits.indexOf(c);  
			val = 16*val + d;  
		}  
		return val;  
	}  
	public static void main(String args[])
	{    
		System.out.println("Decimal of a is: "+getDecimal("a"));  
		System.out.println("Decimal of f is: "+getDecimal("f"));  
		System.out.println("Decimal of 121 is: "+getDecimal("121"));  
	}
}    