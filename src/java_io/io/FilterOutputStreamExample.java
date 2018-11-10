package java_io.io;
import java.io.IOException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
public class FilterOutputStreamExample
{
	public static void main(String args[])throws IOException
	{
		File data=new File("src/java_io/io/Java IO Files/testout6.txt");
		FileOutputStream file=new FileOutputStream(data);
		FilterOutputStream filter=new FilterOutputStream(file);
		String str="My name is Natasha Kaul.";
		byte[] ary=str.getBytes();
		filter.write(ary);
		filter.flush();
		filter.close();
		file.flush();
		file.close();
		System.out.println("Success...");
	}
}
