package java_date.java_8_date_time;
import java.time.Period;
public class PeriodOfMethodExample
{
	public static void main(String[] args)
	{
		Period period=Period.of(2017,02,16);
		System.out.println(period.toString());
	}
}