package java_io.io;
import java.io.IOException;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
public class DataOutputStreamExample
{
	public static void main(String args[])throws IOException
	{
		FileOutputStream fout=new FileOutputStream("src/java_io/io/Java IO Files/testout5.txt");
		DataOutputStream dout=new DataOutputStream(fout);
		dout.writeInt(75);
		dout.flush();
		dout.close();
		System.out.println("Success...");
	}
}

//It is used to write primitive data types to the output stream