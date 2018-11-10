package java_date.java_8_date_time;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
public class LocalTimeExample
{
	public static void main(String... args)
	{
		ZoneId zone1=ZoneId.of("Asia/Kolkata");
		ZoneId zone2=ZoneId.of("Asia/Tokyo");
		LocalTime time1=LocalTime.now(zone1);
		System.out.println("Indian Time Zone : "+time1);
		LocalTime time2=LocalTime.now(zone2);
		System.out.println("Japan Time Zone : "+time2);
        long hours =ChronoUnit.HOURS.between(time1,time2);
        System.out.println("Hours between two Time Zone : "+hours);
        long minutes=ChronoUnit.MINUTES.between(time1,time2);
        System.out.println("Minutes between two time Zone : "+minutes);
	}
}