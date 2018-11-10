package java_conversion.conversion;
public class OctalToDecimalCustomLogicExample
{  
	public static int getDecimal(int octal)
	{    
		int decimal = 0;    
		int n = 0;    
		while(true)
		{    
			if(octal == 0)
			{    
				break;    
			} 
			else 
			{    
				int temp = octal%10;    
				decimal += temp*Math.pow(8,n);    
				octal = octal/10;    
				n++;    
			}    
		}    
		return decimal;    
	}    
	public static void main(String args[])
	{      
		System.out.println("Decimal of 121 octal is: "+getDecimal(121));    
		System.out.println("Decimal of 23 octal is: "+getDecimal(23));    
		System.out.println("Decimal of 10 octal is: "+getDecimal(10));    
	}
}  