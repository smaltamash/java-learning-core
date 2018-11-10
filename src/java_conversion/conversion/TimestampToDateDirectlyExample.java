package java_conversion.conversion;
import java.sql.Timestamp;
import java.util.Date;
import java.text.SimpleDateFormat;
public class TimestampToDateDirectlyExample
{
	public static void main(String[] args)
	{
		Timestamp ts=new Timestamp(System.currentTimeMillis());
		Date date=ts;
		System.out.println(date);
	}
}

