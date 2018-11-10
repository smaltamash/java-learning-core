package java_date.java_current_date_time;
public class SQLDateExample
{
	public static void main(String[] args)
	{
		long millis=System.currentTimeMillis();
		java.sql.Date date=new java.sql.Date(millis);	
		System.out.println(date);
	}
}