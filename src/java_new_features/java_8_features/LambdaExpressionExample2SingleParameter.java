package java_new_features.java_8_features;
interface Sayable2
{
	public String say(String name);
}
public class LambdaExpressionExample2SingleParameter
{
	public static void main(String []args)
	{
		//Lambda Expression with single parameter
		Sayable2 s=(name)->{
			return "Hello, "+name;
		};
		System.out.println(s.say("Sakshi"));
		//You can omit function parantheses
		Sayable2 s2=name->{
			return "Hello, "+name;
		};
		System.out.println(s2.say("Deepika"));
	}
}