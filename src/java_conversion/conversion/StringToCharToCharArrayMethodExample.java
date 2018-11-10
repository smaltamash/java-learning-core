package java_conversion.conversion;
public class StringToCharToCharArrayMethodExample
{
	public static void main(String[] args)throws Exception
	{
		String s="Taniya";
		char c[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			System.out.println("Character at "+i+" index is "+c[i]);
		} 
	}
}