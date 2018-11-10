package java_date.java_8_date_time;
import java.time.ZonedDateTime;
public class ZonedDateTimeExample
{
	public static void main(String[] args)
	{
		ZonedDateTime zone=ZonedDateTime.parse("2016-10-05T08:20:10+05:30[Asia/Kolkata]");
		System.out.println(zone);
	}
}