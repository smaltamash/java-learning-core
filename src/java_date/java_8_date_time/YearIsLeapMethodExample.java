package java_date.java_8_date_time;
import java.time.Year;
public class YearIsLeapMethodExample
{
	public static void main(String[] args)
	{
		Year y=Year.of(2016);
		System.out.println(y.isLeap());	
	}
}