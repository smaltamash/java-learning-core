package java_new_features.java_4_and_5_features;
class A
{
	void m()
	{
		System.out.println("Hello m");
	}
	@Deprecated
	void n()
	{
		System.out.println("Hello n");
	}
}
public class AnnotationDeprecatedExample
{
	public static void main(String[] args)
    {
    	A a=new A();
    	a.n();
    }
}