package java_date.java_8_date_time;
import java.time.LocalDate;
public class LocalDateExample
{
	public static void main(String[] args)
	{
		LocalDate date=LocalDate.now();
		LocalDate yesterday=date.minusDays(1);
		LocalDate tomorrow=yesterday.plusDays(2);
		System.out.println("Today Date :"+date);
		System.out.println("Yesterday Date :"+yesterday);
		System.out.println("Tomorrow Date :"+tomorrow);
	}
}