package java_date.java_8_date_time;
import java.time.Clock;
public class ClockGetZoneMethodExample
{
	public static void main(String[] args)
	{
		Clock c=Clock.systemDefaultZone();
		System.out.println(c.getZone());
	}
}