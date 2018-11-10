package java_new_features.java_4_and_5_features;
enum Season //If you declare it as public it will give compile time error because it needs to be declared in a seperate file
{
	WINTER,SPRING,SUMMER,FALL
}	
public class EnumOutsideClassExample
{
	public static void main(String args[])
	{
		Season s=Season.WINTER;
		System.out.println(s);
	}
}