package java_new_features.java_8_features;
import java.util.function.BiFunction;
class Arithmetic3
{
	public int add(int a,int b)
	{
		return a+b;
	}
}
public class MethodReferenceExample7UsingInstanceMethodAndBiFunctionInterface
{
	public static void main(String[] args)
	{
		BiFunction<Integer,Integer,Integer>adder=new Arithmetic3()::add;
		int result=adder.apply(57,90);
		System.out.println(result);
	}
}