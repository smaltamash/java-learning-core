package java_date.java_date_classical;
import java.util.TimeZone;
import java.util.Calendar;
public class TimeZoneGetOffsetMethodExample
{
	public static void main(String[] args)
	{
		TimeZone zone=TimeZone.getTimeZone("Asia/Kolkata");
		System.out.println("The Offset value of TimeZone : "+zone.getOffset(Calendar.ZONE_OFFSET));
	}
}