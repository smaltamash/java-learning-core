package java_date.java_date_format;
import java.text.SimpleDateFormat;
import java.util.Date;
public class SimpleDateFormatDateToStringExample
{
	public static void main(String[] args)throws Exception
	{
		Date date=new Date();
		SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
		String strDate=formatter.format(date);
		System.out.println(strDate);	  
	}
}