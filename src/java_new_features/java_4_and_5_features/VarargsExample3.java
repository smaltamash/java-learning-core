package java_new_features.java_4_and_5_features;
public class VarargsExample3
{
	static void display(int num,String... values)
	{
		System.out.println("Number is : "+num);
		for(String s:values)
		{
			System.out.println(s);
		}
	}
	public static void main(String args[])
	{
		display(500,"Olly");
		display(1000,"Laiba","Sita","Daisy","Aiysha");
	}
}