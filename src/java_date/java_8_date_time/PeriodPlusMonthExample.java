package java_date.java_8_date_time;
import java.time.Period;
public class PeriodPlusMonthExample
{
	public static void main(String[] args)
	{
		Period period1=Period.ofMonths(5);
		Period period2=period1.plus(Period.ofMonths(3));
		System.out.println(period2);
	}
}