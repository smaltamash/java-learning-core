package java_date.java_date_classical;
import java.util.Calendar;
public class CalendarGetMaximumMethodExample
{
	public static void main(String[] args)
	{
		Calendar calendar=Calendar.getInstance();
		int maximum=calendar.getMaximum(Calendar.DAY_OF_WEEK);
		System.out.println("Maximum number of days in week "+maximum);
		maximum=calendar.getMaximum(Calendar.WEEK_OF_YEAR);
		System.out.println("Maximum number of weeks in year "+maximum);
	}
}