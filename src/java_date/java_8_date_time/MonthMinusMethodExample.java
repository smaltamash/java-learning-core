package java_date.java_8_date_time;
import java.time.Month;
import java.time.LocalDate;
public class MonthMinusMethodExample
{
	public static void main(String[] args)
	{
		Month month=Month.from(LocalDate.now());
		System.out.println(month.minus(2));
	}
}