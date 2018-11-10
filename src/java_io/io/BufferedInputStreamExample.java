package java_io.io;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.BufferedInputStream;
public class BufferedInputStreamExample
{
	public static void main(String args[])throws IOException
	{
		FileInputStream fin=new FileInputStream("src/java_io/io/Java IO Files/testout3.txt");
		BufferedInputStream bin=new BufferedInputStream(fin);
		int i=0;
		while((i=bin.read())!=-1)
        {
        	System.out.print((char)i);
        }
  		bin.close();
		fin.close();
	}
}

//It uses a Buffer and makes processing fast and brings efficiency
//you cannot use flush method here