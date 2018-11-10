package java_new_features.java_8_features;
interface Sayable1
{
	public String say();
}
public class LambdaExpressionExample1NoParameter
{
	public static void main(String []args)
	{
		Sayable1 s=()->{
			return "I have something to say";
		};
		System.out.println(s.say());
	}
}