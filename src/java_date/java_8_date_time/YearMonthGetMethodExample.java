package java_date.java_8_date_time;
import java.time.YearMonth;
import java.time.temporal.ChronoField;
public class YearMonthGetMethodExample
{
	public static void main(String[] args)
	{
		YearMonth ym=YearMonth.now();
		long l1=ym.get(ChronoField.YEAR);
		System.out.println(l1);
		long l2=ym.get(ChronoField.MONTH_OF_YEAR);
		System.out.println(l2);	
	}
}