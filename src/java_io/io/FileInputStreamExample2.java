package java_io.io;
import java.io.FileInputStream;
public class FileInputStreamExample2
{
	public static void main(String args[])
	{
		try
		{
			FileInputStream fin=new FileInputStream("src/java_io/io/Java IO Files/testout2.txt");
			int i=0;
			while((i=fin.read())!=-1)
			{
				System.out.print((char)i);
			}
			fin.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

//Reading all characters
//If there is no such file it will not create a file and will give exception