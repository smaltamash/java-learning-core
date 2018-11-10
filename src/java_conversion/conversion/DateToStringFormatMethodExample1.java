package java_conversion.conversion;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
public class DateToStringFormatMethodExample1 
{
	public static void main(String[] args)throws Exception
	{
		Date date=Calendar.getInstance().getTime();
		DateFormat dateFormat=new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String strDate=dateFormat.format(date);
		System.out.println("Convertred String : "+strDate);	
	}
}