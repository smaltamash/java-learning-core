package java_date.java_8_date_time;
import java.time.OffsetDateTime;
public class OffsetDateTimeGetDayOfWeekMethodExample
{
	public static void main(String[] args)
	{
		OffsetDateTime offsetDT=OffsetDateTime.now();
		System.out.println(offsetDT.getDayOfWeek());
	}
}