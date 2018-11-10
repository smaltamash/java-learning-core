package java_date.java_8_date_time;
import java.time.Month;
import java.time.LocalDate;
import java.time.Year;
import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;
public class MonthExample
{
	public static void main(String[] args)
	{
		Month month=Month.valueOf("January".toUpperCase());
		System.out.printf("For the month of %s all Sundays are : %n",month);
		LocalDate localDate=Year.now().atMonth(month).atDay(1).with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));
		Month mi=localDate.getMonth();
		while(mi==month)
		{
			System.out.printf("%s%n",localDate);
			localDate=localDate.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
			mi=localDate.getMonth();
		}
	}
}