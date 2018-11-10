package java_date.java_date_classical;
public class SQLDateExample1
{
	public static void main(String[] args)
	{
		long millis=System.currentTimeMillis();
		java.sql.Date date=new java.sql.Date(millis);
		System.out.println(date);
	}
}