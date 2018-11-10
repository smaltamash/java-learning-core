package java_date.java_8_date_time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class LocalDateTimeNowMethodExample
{
	public static void main(String[] args)
	{
		LocalDateTime now=LocalDateTime.now();
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatDateTime=now.format(format);
		System.out.println(formatDateTime);
	}
}