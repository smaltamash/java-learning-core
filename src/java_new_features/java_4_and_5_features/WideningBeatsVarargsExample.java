package java_new_features.java_4_and_5_features;
public class WideningBeatsVarargsExample
{
	static void m(int i1,int i2)
	{
		System.out.println("int int");
	}
	static void m(Integer... i)
	{
		System.out.println("Integer...");
	}
	public static void main(String args[])
	{
		short s1=30,s2=90;
		m(s1,s2);
	}
}