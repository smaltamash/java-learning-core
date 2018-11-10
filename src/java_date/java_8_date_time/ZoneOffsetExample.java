package java_date.java_8_date_time;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.Temporal;
public class ZoneOffsetExample
{
	public static void main(String[] args)
	{
		ZoneOffset zoneOffset=ZoneOffset.UTC;
		Temporal temp=zoneOffset.adjustInto(ZonedDateTime.now());
		System.out.println(temp);	
	}
}