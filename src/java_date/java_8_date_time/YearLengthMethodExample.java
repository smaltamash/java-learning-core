package java_date.java_8_date_time;
import java.time.Year;
public class YearLengthMethodExample
{
	public static void main(String[] args)
	{
		Year y=Year.of(2017);
		System.out.println(y.length());	
	}
}