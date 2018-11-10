package java_new_features.java_8_features;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
class Calculate
{
	int add(int a,int b)
	{
		return (a+b);
	}
	int mul(int a,int b)
	{
		return (b*a);
	}
}
public class ParameterReflectionExample1
{
	public static void main(String args[])
	{
		//Creating object of a class
		Calculate calculate=new Calculate();
		//Instantiating Class class
		Class cls=calculate.getClass();
		//Getting declared methods inside the Calculate class
		Method[] method=cls.getDeclaredMethods(); //It returns array of methods
		//Iterating method array
		for(Method method2:method)
		{
			System.out.print(method2.getName()); //Getting name of method
			//Getting parameters of each method
			Parameter parameter[]=method2.getParameters(); //It returns array of parameters
			//Iterating parameter array
			for(Parameter parameter2:parameter)
			{
				System.out.print(" "+parameter2.getParameterizedType()); //Returns type of Parameter
				System.out.print(" "+parameter2.getName()); //Returns parameter name
			}
			System.out.println();
		} 
	}
}
//Compile above program with following command in terminal or cmd and see output
//javac -parameters ParameterReflectionExample1.java
//java ParameterReflectionExample1