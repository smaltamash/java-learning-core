package java_date.java_8_date_time;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.LocalTime;
public class DurationGetMethodExample
{
	public static void main(String[] args)
	{
		Duration d=Duration.between(LocalTime.NOON,LocalTime.MAX);
		System.out.println(d.get(ChronoUnit.SECONDS));
	}
}