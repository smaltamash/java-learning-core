package java_date.java_date_format;
import java.text.DateFormat;
import java.util.Date;
public class DateFormatExample
{
	public static void main(String[] args)
	{
		Date currentDate=new Date();
		System.out.println("Current Date : "+currentDate);
		String dateToStr=DateFormat.getInstance().format(currentDate);
		System.out.println("Date Format using getInstance() : "+dateToStr);
		dateToStr = DateFormat.getDateInstance().format(currentDate);  
        System.out.println("Date Format using getDateInstance(): "+dateToStr);  
        dateToStr = DateFormat.getTimeInstance().format(currentDate);  
        System.out.println("Date Format using getTimeInstance(): "+dateToStr);  
        dateToStr = DateFormat.getDateTimeInstance().format(currentDate);  
        System.out.println("Date Format using getDateTimeInstance(): "+dateToStr);  
        dateToStr = DateFormat.getTimeInstance(DateFormat.SHORT).format(currentDate);  
        System.out.println("Date Format using getTimeInstance(DateFormat.SHORT): "+dateToStr);  
        dateToStr = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(currentDate);  
        System.out.println("Date Format using getTimeInstance(DateFormat.MEDIUM): "+dateToStr);  
        dateToStr = DateFormat.getTimeInstance(DateFormat.LONG).format(currentDate);  
        System.out.println("Date Format using getTimeInstance(DateFormat.LONG): "+dateToStr);  
        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(currentDate);  
        System.out.println("Date Format using getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT): "+dateToStr);  
	}
}