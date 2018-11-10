package java_date.java_8_date_time;
import java.time.DayOfWeek;
public class DayOfWeekOfMethodExample
{
	public static void main(String[] args)
	{
		DayOfWeek day=DayOfWeek.of(5);
		System.out.println(day.name());
		System.out.println(day.ordinal());
		System.out.println(day.getValue());
	}
}