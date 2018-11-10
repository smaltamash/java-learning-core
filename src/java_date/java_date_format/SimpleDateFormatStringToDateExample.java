package java_date.java_date_format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class SimpleDateFormatStringToDateExample
{
	public static void main(String[] args)throws Exception
	{
		SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
		try
		{
			Date date=formatter.parse("31/03/2015");
			System.out.println("Date is : "+date);
		}
		catch(ParseException e)
		{
			e.printStackTrace();
		}
	}
}