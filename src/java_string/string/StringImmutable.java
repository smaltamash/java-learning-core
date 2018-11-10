package java_string.string;
public class StringImmutable
{
	public static void main(String []args)
	{
		String s1="Sachin"; 
		s1.concat("Tendulkar");
		//concat() method appends string at the end
		System.out.println(s1);
		//will print Sachin because string are immutable object
	}
}