package java_io.io;
import java.io.IOException;
import java.io.ByteArrayInputStream;
import java.io.PushbackInputStream;
public class PushbackInputStreamExample
{
	public static void main(String args[])throws IOException
	{
		String srg="1##2#34###12";
		byte[] ary=srg.getBytes();
		ByteArrayInputStream bin=new ByteArrayInputStream(ary);
		PushbackInputStream pin=new PushbackInputStream(bin);
		int i;
		while((i=pin.read())!=-1)
		{
			if(i=='#')
			{
				int j;
			if((j=pin.read())=='#')
			{
				System.out.print("**");
			}
			else
			{
				pin.unread(j);
				System.out.print((char)i);
			}
		}
		else
		{
			System.out.print((char)i);
		}
		}
	} 
}
