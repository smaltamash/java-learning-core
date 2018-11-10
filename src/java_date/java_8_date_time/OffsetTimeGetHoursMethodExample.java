package java_date.java_8_date_time;
import java.time.OffsetTime;
public class OffsetTimeGetHoursMethodExample
{
	public static void main(String[] args)
	{
		OffsetTime offset=OffsetTime.now();
		int h=offset.getHour();
		System.out.println(h+" hours");
	}
}