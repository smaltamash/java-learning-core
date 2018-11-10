package java_date.java_date_classical;
import java.util.TimeZone;
public class TimeZoneGetDisplayNameMethodExample
{
	public static void main(String[] args)
	{
		TimeZone zone=TimeZone.getDefault();
		String name=zone.getDisplayName();
		System.out.println("Display Name for Default time zone : "+name);
	}
}