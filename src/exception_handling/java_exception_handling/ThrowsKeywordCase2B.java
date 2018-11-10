package exception_handling.java_exception_handling;
import java.io.IOException;
class M3
{
	void method()throws IOException
	{
		throw new IOException("Device Error");
	}
}
public class ThrowsKeywordCase2B
{
	public static void main(String[]args)throws IOException
	{
		M3 m=new M3();
		m.method();
		System.out.println("Normal Flow");
	}
}

//In case exception occur exception will be thrown at runtime
