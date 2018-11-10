package java_conversion.conversion;
public class IntToDoubleExample2
{
	public static void main(String[] args)throws Exception
	{
		int i=89;
		Double d=new Double(i); //first way
		Double d2=Double.valueOf(i); //second way
		System.out.println(d);
		System.out.println(d2);  	
	}
}