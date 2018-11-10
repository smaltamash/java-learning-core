package java_new_features.java_4_and_5_features;
public class WideningBeatsBoxingExample
{
	static void m(int i)
	{
		System.out.println("int");
	}
	static void m(Integer i)
	{
		System.out.println("Integer");
	}
	public static void main(String args[])
	{
		short s=30;
		m(s);
	}
}