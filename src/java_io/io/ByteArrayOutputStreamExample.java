package java_io.io;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ByteArrayOutputStream;
public class ByteArrayOutputStreamExample
{
	public static void main(String args[])throws IOException
	{
		FileOutputStream fout1=new FileOutputStream("src/java_io/io/Java IO Files/F1.txt");
		FileOutputStream fout2=new FileOutputStream("src/java_io/io/Java IO Files/F2.txt");
		ByteArrayOutputStream bout=new ByteArrayOutputStream();
		bout.write(73);
        bout.writeTo(fout1);
        bout.writeTo(fout2);
		bout.flush();
		bout.close();
		fout2.close();
		fout1.close();
		System.out.println("Success...");
	}
}

//It is used to write common data to multiple files