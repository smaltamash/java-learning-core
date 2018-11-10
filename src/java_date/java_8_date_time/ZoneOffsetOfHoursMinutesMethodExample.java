package java_date.java_8_date_time;
import java.time.ZoneOffset;
public class ZoneOffsetOfHoursMinutesMethodExample
{
	public static void main(String[] args)
	{
		ZoneOffset zoneOffset=ZoneOffset.ofHoursMinutes(5,30);
		System.out.println(zoneOffset);	
	}
}