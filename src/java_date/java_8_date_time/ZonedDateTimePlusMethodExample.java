package java_date.java_8_date_time;
import java.time.ZonedDateTime;
import java.time.Period;
public class ZonedDateTimePlusMethodExample
{
	public static void main(String[] args)
	{
		ZonedDateTime zone=ZonedDateTime.now();
		ZonedDateTime p=zone.plus(Period.ofDays(226));
		System.out.println(p);
	}
}