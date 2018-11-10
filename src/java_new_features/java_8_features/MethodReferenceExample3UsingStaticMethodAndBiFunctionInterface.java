package java_new_features.java_8_features;
import java.util.function.BiFunction;
class Arithmetic1
{
	public static int add(int a,int b)
	{
		return a+b;
	}
}
public class MethodReferenceExample3UsingStaticMethodAndBiFunctionInterface
{
	public static void main(String[] args)
	{
		BiFunction<Integer,Integer,Integer>adder=Arithmetic1::add;
		int result=adder.apply(10,20);
		System.out.println(result);
 	}
}