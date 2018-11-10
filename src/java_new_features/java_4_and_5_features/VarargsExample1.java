package java_new_features.java_4_and_5_features;
import java.util.ArrayList;
public class VarargsExample1
{
	static void display(String... values)
	{
		System.out.println("Display Method Invoked");
	}
	public static void main(String args[])
	{
		display(); //Zero arguments
		display("my","name","is","Yakshi"); //Four arguments
	}
}