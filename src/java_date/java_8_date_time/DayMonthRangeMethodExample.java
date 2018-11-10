package java_date.java_8_date_time;
import java.time.MonthDay;
import java.time.temporal.ValueRange;
import java.time.temporal.ChronoField;
public class DayMonthRangeMethodExample
{
	public static void main(String[] args)
	{
		MonthDay month=MonthDay.now();
		ValueRange r1=month.range(ChronoField.MONTH_OF_YEAR);
		System.out.println(r1);
		ValueRange r2=month.range(ChronoField.DAY_OF_MONTH);
		System.out.println(r2);
	}
}