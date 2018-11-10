package java_date.java_8_date_time;
import java.time.Clock;
public class ClockInstantMethodExample
{
	public static void main(String[] args)
	{
		Clock c=Clock.systemUTC();
		System.out.println(c.instant());
	}
}