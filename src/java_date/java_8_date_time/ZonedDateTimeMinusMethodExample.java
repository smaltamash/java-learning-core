package java_date.java_8_date_time;
import java.time.ZonedDateTime;
import java.time.Period;
public class ZonedDateTimeMinusMethodExample
{
	public static void main(String[] args)
	{
		ZonedDateTime zone=ZonedDateTime.now();
		ZonedDateTime m=zone.minus(Period.ofDays(126));
		System.out.println(m);
	}
}