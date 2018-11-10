package java_date.java_8_date_time;
import java.time.ZoneId;
public class ZoneIdGetIdMethodExample
{
	public static void main(String[] args)
	{
		ZoneId zone=ZoneId.systemDefault();
		String s=zone.getId();
		System.out.println(s);	
	}
}