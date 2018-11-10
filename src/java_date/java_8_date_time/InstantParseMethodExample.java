package java_date.java_8_date_time;
import java.time.Instant;
public class InstantParseMethodExample
{
	public static void main(String[] args)
	{
		Instant inst=Instant.parse("2017-02-03T10:37:30.00Z");
		System.out.println(inst);
	}
}