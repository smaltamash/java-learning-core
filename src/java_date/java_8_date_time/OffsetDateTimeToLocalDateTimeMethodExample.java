package java_date.java_8_date_time;
import java.time.OffsetDateTime;
public class OffsetDateTimeToLocalDateTimeMethodExample
{
	public static void main(String[] args)
	{
		OffsetDateTime offsetDT=OffsetDateTime.now();
		System.out.println(offsetDT.toLocalDate());
	}
}