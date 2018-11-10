package java_date.java_current_date_time;
import java.util.Date;
public class CalendarExample
{
	public static void main(String[] args)
	{
		Date date=java.util.Calendar.getInstance().getTime();
		System.out.println(date);
	}
}