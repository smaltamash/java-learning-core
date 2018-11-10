package java_date.java_8_date_time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class LocalDateTimeMinusDaysMethodExample
{
	public static void main(String[] args)
	{
		LocalDateTime dateTime1=LocalDateTime.of(2017,1,14,10,34);
		LocalDateTime dateTime2=dateTime1.minusDays(100);
		System.out.println("Before Formatting : "+dateTime2);
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		String formatDateTime=dateTime2.format(format);
		System.out.println("After Formatting : "+formatDateTime);
	}
}