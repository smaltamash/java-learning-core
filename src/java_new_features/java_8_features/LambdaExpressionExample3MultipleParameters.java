package java_new_features.java_8_features;
interface Addable1
{
	int add(int a,int b);
}
public class LambdaExpressionExample3MultipleParameters
{
	public static void main(String []args)
	{
		//Multiple Parameters in Lambda Expression
		//Addable1 ad1=(a,b)->{return (a+b);}; //you can uncomment this line and comment below line it will work the same
		Addable1 ad1=(a,b)->(a+b); 
		System.out.println(ad1.add(123,278));
		//Multiple parameters with data type in lambda expression
		Addable1 ad2=(int a,int b)->(a+b);
		System.out.println(ad2.add(23,78));
	}
}