package java_new_features.java_4_and_5_features;
public class AutoBoxingOrBoxingExample1
{
	public static void main(String args[])
	{
		int a=50;
		Integer a2=new Integer(a); //Auto-Boxing(Boxing)
		Integer a3=5; //Auto-Boxing(Boxing)
		System.out.println(a2+" "+a3);	
	}
}