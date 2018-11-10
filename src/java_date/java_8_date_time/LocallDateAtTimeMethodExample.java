package java_date.java_8_date_time;
import java.time.LocalDate;
import java.time.LocalDateTime;
public class LocallDateAtTimeMethodExample
{
	public static void main(String[] args)
	{
		LocalDate date=LocalDate.of(2017,1,13);
		LocalDateTime dateTime=date.atTime(1,50,9);
		System.out.println(dateTime);
	}
}