package java_date.java_date_classical;
import java.util.Calendar;
public class CalendarGetMinimumMethodExample
{
	public static void main(String[] args)
	{
		Calendar calendar=Calendar.getInstance();
		int minimum=calendar.getMinimum(Calendar.DAY_OF_WEEK);
		System.out.println("Minimum number of days in week "+minimum);
		minimum=calendar.getMinimum(Calendar.WEEK_OF_YEAR);
		System.out.println("Minimum number of weeks in year "+minimum);
	}
}