package java_date.java_8_date_time;
import java.util.Locale;
import java.time.ZoneId;
import java.time.format.TextStyle;
public class ZoneIdGetDisplayNameMethodExample
{
	public static void main(String[] args)
	{
		ZoneId zoneId=ZoneId.systemDefault();
		System.out.println(zoneId.getDisplayName(TextStyle.FULL,Locale.ROOT));	
	}
}