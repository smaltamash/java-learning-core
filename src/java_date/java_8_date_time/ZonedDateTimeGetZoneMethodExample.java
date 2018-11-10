package java_date.java_8_date_time;
import java.time.ZonedDateTime;
public class ZonedDateTimeGetZoneMethodExample
{
	public static void main(String[] args)
	{
		ZonedDateTime zone=ZonedDateTime.now();
		System.out.println(zone.getZone());
	}
}