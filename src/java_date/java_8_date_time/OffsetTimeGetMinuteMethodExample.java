package java_date.java_8_date_time;
import java.time.OffsetTime;
public class OffsetTimeGetMinuteMethodExample
{
	public static void main(String[] args)
	{
		OffsetTime offset=OffsetTime.now();
		int m=offset.getMinute();
		System.out.println(m+" minute");
	}
}