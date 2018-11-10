package basics_of_java.introduction;
// ADDING LOWER TYPE 2
public class AddingLowerType2 
{
	public static void main(String[] args)
	{
		short a=10;
		short b=5;
		a=(short)(a+b); //20 which is int now converted to short
		System.out.println(a);
	}
}
//a=a+b; //it will give error of compilation because (a+b) will be int