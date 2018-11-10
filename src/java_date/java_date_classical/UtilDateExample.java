package java_date.java_date_classical;
public class UtilDateExample
{
	public static void main(String[] args)
	{
		//1st Way
		java.util.Date date1=new java.util.Date();
		System.out.println(date1);
		//2nd Way
		long millis=System.currentTimeMillis();
		java.util.Date date2=new java.util.Date(millis);
		System.out.println(date2);
	}
}