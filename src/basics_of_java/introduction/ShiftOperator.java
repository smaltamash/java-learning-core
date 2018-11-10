package basics_of_java.introduction;
// >> vs >>>
public class ShiftOperator
{
	public static void main(String[] args)
	{
		//for positive no >> and >>> work same		
	    System.out.println(20>>2); //20/2^2=20/4=5
	    System.out.println(20>>2); //20/2^2=20/4=5
	    //for negative numbers, >>> changes parity bit(MSB) to 0		
	    System.out.println(-20>>2); //-20/2^2=-20/4=-5
	    System.out.println(-20>>>2); //1073741819
	}
}
