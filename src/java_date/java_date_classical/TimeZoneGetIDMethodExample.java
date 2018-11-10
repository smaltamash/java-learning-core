package java_date.java_date_classical;
import java.util.TimeZone;
import java.util.Calendar;
public class TimeZoneGetIDMethodExample
{
	public static void main(String[] args)
	{
		TimeZone zone=TimeZone.getTimeZone("Asia/Kolkata");
		System.out.println("Value of ID is : "+zone.getID());
	}
}