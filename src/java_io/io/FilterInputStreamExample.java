package java_io.io;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.BufferedInputStream;
public class FilterInputStreamExample
{
	public static void main(String args[])throws IOException
	{
		File data=new File("src/java_io/io/Java IO Files/testout6.txt");
		FileInputStream file=new FileInputStream(data);
		//FilterInputStream filter=new FilterInputStream(file); //We cannot write this line as constructor is protected
		FilterInputStream filter=new BufferedInputStream(file);
		int k=0;
	    while((k=filter.read())!=-1)
	    {
	    	System.out.print((char)k);
	    }
	    filter.close();
	    file.close();
	}
}
