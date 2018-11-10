package java_date.java_date_format;
import java.text.DateFormat;
import java.util.Date;
public class DateFormatStringToDateExample
{
	public static void main(String[] args)throws Exception
	{
		//Date d=DateFormat.getDateInstance().parse("31 Mar,2015"); //wrong
		Date d=DateFormat.getDateInstance().parse("31-Mar-2015");
		System.out.println("Date is "+d);  
	}
} 