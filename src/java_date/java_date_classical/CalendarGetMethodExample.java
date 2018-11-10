package java_date.java_date_classical;
import java.util.Calendar;
public class CalendarGetMethodExample
{
	public static void main(String[] args)
	{
		Calendar calendar=Calendar.getInstance();
		System.out.println("At Present Calendar's Year : "+calendar.get(Calendar.YEAR));
		System.out.println("At Present Calendar's Day : "+calendar.get(Calendar.DATE));
	}
}