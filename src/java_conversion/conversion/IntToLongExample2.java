package java_conversion.conversion;
public class IntToLongExample2
{
	public static void main(String[] args)throws Exception
	{
		int i=90;
		Long l=new Long(i); //first way
		Long l2=Long.valueOf(i); //second way
		System.out.println(l+"\n"+l2);  	
	}
}