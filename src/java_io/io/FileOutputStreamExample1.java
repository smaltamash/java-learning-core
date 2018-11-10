package java_io.io;
import java.io.FileOutputStream;
public class FileOutputStreamExample1
{
	public static void main(String args[])
	{
		try
		{
			FileOutputStream fout=new FileOutputStream("src/java_io/io/Java IO Files/testout1.txt");
			fout.write(65);
			fout.close();
			System.out.println("Success...");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

//Writing a Byte
//If a file is not available it will create a file and write to it and if file is present it will override it 