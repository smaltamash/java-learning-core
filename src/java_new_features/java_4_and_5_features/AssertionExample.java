package java_new_features.java_4_and_5_features;
import java.util.Scanner;
public class AssertionExample
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your age ");
		int value=sc.nextInt();
		assert value>=18:"Not Valid"; //It will check if age is greater than or equal to 18, if age is less than 18 it will give AssertionException "Not Valid" 
		System.out.println("Value is : "+value);
	}
}
//compile using javac AssertionExample.java
//Run using java -ea AssertionExample our using java -enableassertions AssertionExample
//if you will run it using java AssertionExample it will work fine but assertion will not work because assertion is disabled by default