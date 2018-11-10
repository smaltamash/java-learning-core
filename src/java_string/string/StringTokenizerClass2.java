package java_string.string;
import java.util.StringTokenizer;
public class StringTokenizerClass2
{
	public static void main(String[]args)
	{
		StringTokenizer st=new StringTokenizer("my,name,is,Komal");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken(","));
		}
	}
}