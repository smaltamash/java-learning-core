package java_io.io;
import java.io.FileOutputStream;
public class FileOutputStreamExample2
{
	public static void main(String args[])
	{
		try
		{
			FileOutputStream fout=new FileOutputStream("src/java_io/io/Java IO Files/testout2.txt");
			String str="Hello I am Faiza Shamshi.";
			byte[] b=str.getBytes(); //Converting String into Bytes
			fout.write(b);
			fout.close();
			System.out.println("Success...");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

//Write a String to a File
//If a file is not available it will create a file and write to it and if file is present it will override it 