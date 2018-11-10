package java_new_features.java_4_and_5_features;
import java.util.ArrayList;
public class VarargsExample2
{
	static void display(String... values)
	{
		System.out.println("Display Method Invoked");
		for(String s:values)
		{
			System.out.println(s);
		}
	}
	public static void main(String args[])
	{
		display(); //Zero arguments
		display("Komal"); //One arguments
		display("Geeta","Sita","Daisy","Jeniffer"); //Four arguments
	}
}