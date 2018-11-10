package java_date.java_date_classical;
import java.util.TimeZone;
public class TimeZoneGetAvailableIdsMethodExample
{
	public static void main(String[] args)
	{
		String[] id=TimeZone.getAvailableIDs();
		System.out.println("In TimeZone class availble Ids are : ");
		for(int i=0;i<id.length;i++)
		{
			System.out.println(id[i]);
		}
	}
}