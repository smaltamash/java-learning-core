package java_date.java_8_date_time;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
public class YearMonthFormatMethodExample
{
	public static void main(String[] args)
	{
		YearMonth ym=YearMonth.now();
		String s=ym.format(DateTimeFormatter.ofPattern("MM yyyy"));
		System.out.println(s);	
	}
}