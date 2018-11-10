package java_date.java_8_date_time;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
public class InstantIsSupportedMethodExample
{
	public static void main(String[] args)
	{
		Instant inst=Instant.parse("2017-02-03T11:35:30.00Z");
		System.out.println(inst.isSupported(ChronoUnit.DAYS));
		System.out.println(inst.isSupported(ChronoUnit.YEARS));
	}
}