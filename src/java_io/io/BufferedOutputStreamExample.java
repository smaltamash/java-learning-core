package java_io.io;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedOutputStream;
public class BufferedOutputStreamExample
{
	public static void main(String args[])throws IOException
	{
		FileOutputStream fout=new FileOutputStream("src/java_io/io/Java IO Files/testout3.txt");
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		String str="Hello i am Daisy.\nHow are you?";
		byte b[]=str.getBytes();
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("Success...");
	}
}

//It uses a Buffer and makes processing fast and brings efficiency