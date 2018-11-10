package java_date.java_8_date_time;
import java.time.OffsetTime;
public class OffsetTimeGetSecondsMethodsExample
{
	public static void main(String[] args)
	{
		OffsetTime offset=OffsetTime.now();
		int s=offset.getSecond();
		System.out.println(s+" second");
	}
}