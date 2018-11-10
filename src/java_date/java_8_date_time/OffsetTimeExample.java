package java_date.java_8_date_time;
import java.time.OffsetTime;
import java.time.temporal.ChronoField;
public class OffsetTimeExample
{
	public static void main(String[] args)
	{
		OffsetTime offset=OffsetTime.now();
		int h=offset.get(ChronoField.HOUR_OF_DAY);
		System.out.println(h);
		int m=offset.get(ChronoField.MINUTE_OF_DAY);
		System.out.println(m);
		int s=offset.get(ChronoField.SECOND_OF_DAY);
		System.out.println(s);
	}
}