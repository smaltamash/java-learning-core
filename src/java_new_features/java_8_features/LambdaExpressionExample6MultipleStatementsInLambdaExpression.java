package java_new_features.java_8_features;
@FunctionalInterface
interface Sayable3
{
	String say(String message);
}
public class LambdaExpressionExample6MultipleStatementsInLambdaExpression
{
	public static void main(String []args)
	{
		//You can pass multiple statements in lambda expression
		Sayable3 person=(message)->{
			String s1="I would like to say, ";
			String s2=s1+message;
			return s2;
		};
		System.out.println(person.say("Time is Precious"));
	}
}