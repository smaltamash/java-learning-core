package exception_handling.java_exception_handling;
import java.io.IOException;
class M1
{
	void method()throws IOException
	{
		System.out.println("Device Operation Performed");
	}
}
public class ThrowsKeywordCase2A
{
	public static void main(String[]args)throws IOException
	{
		M1 m=new M1();
		m.method();
		System.out.println("Normal Flow");
	}
}

//In case exception does not occur code will be executed fine
