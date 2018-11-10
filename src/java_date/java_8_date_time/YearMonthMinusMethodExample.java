package java_date.java_8_date_time;
import java.time.YearMonth;
import java.time.Period;
public class YearMonthMinusMethodExample
{
	public static void main(String[] args)
	{
		YearMonth ym1=YearMonth.now();
		YearMonth ym2=ym1.minus(Period.ofYears(3));
		System.out.println(ym2);	
	}
}