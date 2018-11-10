package java_io.io;
import java.io.IOException;
import java.io.InputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
public class DataInputStreamExample
{
	public static void main(String args[])throws IOException
	{
		InputStream fin=new FileInputStream("src/java_io/io/Java IO Files/testout5.txt");
		DataInputStream din=new DataInputStream(fin);
		int c=fin.available();
		byte[] ary=new byte[c];
		din.read(ary);
		for(byte bt:ary)
		{
			char ch=(char)bt;
			System.out.print(ch+"$");
		}
        din.close();
		fin.close();
	}
}

//It is used to read primitive data types from the input stream