package java_io.io;
import java.io.IOException;
import java.io.CharArrayReader;
import java.io.PushbackReader;
public class PushbackReaderExample
{
	public static void main(String args[])throws IOException
	{
		char ary[]={'1','-','-','2','-','3','4','-','-','-','5','6'};
		CharArrayReader bin=new CharArrayReader(ary);
		PushbackReader pr=new PushbackReader(bin);
		int i;
		while((i=pr.read())!=-1)
		{
			if(i=='-')
			{
				int j;
				if((j=pr.read())=='-')
				{
					System.out.print("#*");
				}
				else
				{
					pr.unread(j);
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
