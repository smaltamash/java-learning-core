package java_conversion.conversion;
import java.sql.Timestamp;
import java.util.Date;
import java.text.SimpleDateFormat;
public class DateToTimestampSimpleDateFormatExample
{
	public static void main(String[] args)
	{
		Date date=new Date();
		Timestamp ts=new Timestamp(date.getTime());
		SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(formatter.format(ts));
	}
}

