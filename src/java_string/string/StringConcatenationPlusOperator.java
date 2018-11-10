package java_string.string;
public class StringConcatenationPlusOperator
{
	public static void main(String []args)
	{
		String s1="Sachin"+"Tendulkar"; //compiler will convert it to String s2 = (new StringBuffer()).append("Sachin").append("Tendulkar").toString(); //it can be StringBuilder also 
		String s2=40+40+"Sachin"+50+40; //After String Literal all + operator will be treated as String concatenation operator
		System.out.println(s1+"\n"+s2); 
    }
}