package java_io.io;
import java.io.IOException;
import java.io.ByteArrayInputStream;
public class ByteArrayInputStreamExample
{
	public static void main(String args[])throws IOException
	{
		byte[] b={35,36,37,38};
		ByteArrayInputStream bin=new ByteArrayInputStream(b);
		int k=0;
		while((k=bin.read())!=-1)
		{
			char c=(char)k;
			System.out.println("ASCII value of the character is "+k+" and Special character is "+c);
		}
		bin.close();
	}
}

//It is used to read byte array in input stream