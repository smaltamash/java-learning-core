package basics_of_java.introduction;
// ADDING LOWER TYPE
public class AddingLowerType 
{
	public static void main(String[] args)
	{
		byte a=10;
		byte b=20;
		//byte c=a+b; //Compile Time Error: because a+b=20 will be int, it will be int because compiler thinks it will exceed its range
		byte c=(byte)(a+b);
		System.out.println(c);
	}
}
/*We can also use:-
  final byte a=10;
  final byte b=20;
  byte c=a+b; 
*/
