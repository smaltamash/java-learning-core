package java_date.java_date_classical;
import java.util.Calendar;
public class CalendarExample
{
	public static void main(String[] args)
	{
		Calendar calendar=Calendar.getInstance();
		System.out.println("The Current Date is : "+calendar.getTime());
		calendar.add(Calendar.DATE,-15);
		System.out.println("15 days ago : "+calendar.getTime());
		calendar.add(Calendar.MONTH,4);
		System.out.println("4 months later : "+calendar.getTime());
		calendar.add(Calendar.YEAR,2);
		System.out.println("2 years later : "+calendar.getTime());
	}
}