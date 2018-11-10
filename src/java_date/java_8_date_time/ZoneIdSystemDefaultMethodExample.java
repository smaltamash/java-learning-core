package java_date.java_8_date_time;
import java.time.ZoneId;
public class ZoneIdSystemDefaultMethodExample
{
	public static void main(String[] args)
	{
		ZoneId zone=ZoneId.systemDefault();
		System.out.println(zone);	
	}
}