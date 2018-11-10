package java_date.java_8_date_time;
import java.time.MonthDay;
import java.time.temporal.ChronoField;
public class MonthDayGetMethodExample
{
	public static void main(String[] args)
	{
		MonthDay month=MonthDay.now();
		long n=month.get(ChronoField.MONTH_OF_YEAR);
		System.out.println(n);
	}
}