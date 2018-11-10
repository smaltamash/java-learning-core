package java_new_features.java_8_features;
abstract class AbstractClass
{
	public AbstractClass()
	{
		System.out.println("You can create constructor in abstract class but you cannot create constructor in an interface");
	}
	abstract int add(int a,int b); //Abstract method
	int sub(int a,int b)
	{
		return a-b;
	}
	static int multiply(int a,int b) //static method
	{
		return a*b;
	}
}
public class AbstractClassVsJava8Interface extends AbstractClass
{
	public int add(int a,int b) //implementing abstract method
	{
		return a+b;
	}
	public static void main(String[] args)
	{
		AbstractClassVsJava8Interface p=new AbstractClassVsJava8Interface();
		int result1=p.add(20,10); //Calling abstract method
		int result2=p.sub(20,10); //Calling non-abstract method
		int result3=AbstractClass.multiply(20,10); //Calling static method
		System.out.println("Addition : "+result1);
		System.out.println("Substraction : "+result2);
		System.out.println("Multiplication : "+result3); 
	}
}