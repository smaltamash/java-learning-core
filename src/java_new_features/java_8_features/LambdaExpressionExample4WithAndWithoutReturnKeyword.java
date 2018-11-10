package java_new_features.java_8_features;
interface Addable2
{
	int add(int a,int b);
}
public class LambdaExpressionExample4WithAndWithoutReturnKeyword
{
	public static void main(String []args)
	{
		//Lambda Expression without return keyword
		Addable2 ad1=(a,b)->(a+b);
		System.out.println(ad1.add(1223,2718));
		//Lambda Expression with return Keyword
		Addable2 ad2=(int a,int b)->{
			return (a+b);
		};
		System.out.println(ad2.add(223,718));
	}
}