package java_new_features.java_4_and_5_features;
public class EnumExample4
{
	enum Day 
    {
    	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
    }	
    public static void main(String[] args)
    {
    	Day day=Day.MONDAY;
    	switch(day)
    	{
    		case SUNDAY:
    		System.out.println("Sunday");
    		break;
    		case MONDAY:
    		System.out.println("Monday");
    		break;
    		default:
    		System.out.println("Other Day");
    	}
    }
}