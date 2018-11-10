package java_io.io;
import java.io.FileInputStream;
public class FileInputStreamExample1
{
	public static void main(String args[])
	{
		try
		{
			FileInputStream fin=new FileInputStream("src/java_io/io/Java IO Files/testout1.txt");
			int i=fin.read();
			System.out.println((char)i);
			fin.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

//Reading a  Byte
//If there is no such file it will not create a file and will give exception