package java_date.java_8_date_time;
import java.time.Instant;
import java.time.Duration;
public class InstantMinusMethodExample
{
	public static void main(String[] args)
	{
		Instant inst=Instant.parse("2017-02-03T11:25:30.00Z");
		inst=inst.minus(Duration.ofDays(125));
		System.out.println(inst);
	}
}