package java_date.java_date_format;
import java.text.DateFormat;
import java.util.Date;
public class DateFormatDateToStringExample
{
	public static void main(String[] args)
	{
		Date currentDate=new Date();
		System.out.println("Current Date : "+currentDate);
		String dateToStr=DateFormat.getInstance().format(currentDate);
		System.out.println("Date Format using getInstance() : "+dateToStr);
	}
}