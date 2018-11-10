package java_date.java_8_date_time;
import java.time.LocalDate;
import java.time.MonthDay;
public class MonthDayExample
{
	public static void main(String[] args)
	{
		MonthDay month=MonthDay.now();
		LocalDate date=month.atYear(1994);
		System.out.println(date);
	}
}