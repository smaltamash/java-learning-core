package java_date.java_8_date_time;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
public class DayOfWeekMinusMethodExample
{
	public static void main(String[] args)
	{
		LocalDate date=LocalDate.of(2017,Month.JANUARY,31);
		DayOfWeek day=DayOfWeek.from(date);
		System.out.println(day.getValue());
		day=day.minus(5);
		System.out.println(day.getValue());
	}
}