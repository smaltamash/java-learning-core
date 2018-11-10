package basics_of_java.introduction;
// OVERFLOW
public class Overflow 
{
	public static void main(String[] args)
	{
		int a=130;
		byte b=(byte)a; //byte range =-128 to 127
		//in above line overflow occurs
		System.out.println(a);
		System.out.println(b); //-126 is printed
	}
}

