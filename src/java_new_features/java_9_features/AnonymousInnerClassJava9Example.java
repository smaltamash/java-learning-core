package java_new_features.java_9_features;
abstract class ABCD<T>
{
	abstract T show(T a,T b);
}
public class AnonymousInnerClassJava9Example 
{
	public static void main(String args[])
	{
		ABCD<String> a=new ABCD<>() //Diamond operator is empty, compiler infer type //We can can even use ABCD<String> a=new ABCD<String>()
		{
			String show(String a,String b)
			{
				return a+b;
			}
		};
		String result=a.show("Java"," 9");
		System.out.println(result);
	}
}