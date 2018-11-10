package java_date.java_date_classical;
import java.sql.Date;
public class SQLDateExample2
{
	public static void main(String[] args)
	{
		String str="2015-03-31";
		Date date=Date.valueOf(str); //converting string into sql date
		System.out.println(date);
	}
}