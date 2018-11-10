package java_date.java_8_date_time;
import java.time.Year;
import java.time.LocalDate;
public class YearAtDayMethodExample
{
	public static void main(String[] args)
	{
		Year y=Year.of(2017);
		LocalDate l=y.atDay(123);
		System.out.println(l);	
	}
}