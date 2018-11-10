package java_date.java_8_date_time;
import java.time.LocalTime;
public class LocalTimeMinusHoursMinusMinutesMethodsExample
{
	public static void main(String[] args)
	{
		LocalTime time=LocalTime.of(10,43,12);
		System.out.println(time);
		LocalTime time2=time.minusHours(2);
		LocalTime time3=time2.minusMinutes(34);
		System.out.println(time3);
	}
}