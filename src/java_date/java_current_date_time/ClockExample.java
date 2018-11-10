package java_date.java_current_date_time;
public class ClockExample
{
	public static void main(String[] args)
	{
		System.out.println(java.time.Clock.systemUTC().instant());
	}
}