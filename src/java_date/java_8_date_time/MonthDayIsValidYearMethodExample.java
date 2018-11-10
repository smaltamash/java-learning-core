package java_date.java_8_date_time;
import java.time.MonthDay;
public class MonthDayIsValidYearMethodExample
{
	public static void main(String[] args)
	{
		MonthDay month=MonthDay.now();
		boolean b=month.isValidYear(2012);
		System.out.println(b);
	}
}