package java_date.java_8_date_time;
import java.time.Duration;
import java.time.LocalTime;
public class DurationPlusMethodExample
{
	public static void main(String[] args)
	{
		Duration d1=Duration.between(LocalTime.NOON,LocalTime.MAX);
		System.out.println(d1.getSeconds());
		Duration d2=d1.plus(d1);
		System.out.println(d2.getSeconds());
	}
}	