package java_date.java_current_date_time;
import java.text.SimpleDateFormat;
import java.util.Date;
public class SimpleDateFormatExample
{
	public static void main(String[] args)
	{
		SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date=new Date();
		System.out.println(formatter.format(date));
	}
}