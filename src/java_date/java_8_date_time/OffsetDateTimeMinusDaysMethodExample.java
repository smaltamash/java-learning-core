package java_date.java_8_date_time;
import java.time.OffsetDateTime;
public class OffsetDateTimeMinusDaysMethodExample
{
	public static void main(String[] args)
	{
		OffsetDateTime offsetDT=OffsetDateTime.now();
		OffsetDateTime value=offsetDT.minusDays(240);
		System.out.println(value);
	}
}