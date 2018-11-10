package java_io.io;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
import java.util.Vector;
import java.util.Enumeration;
public class SequenceInputStreamExample3
{
	public static void main(String args[])throws IOException
	{
		//Creating FileInputStream objects for all the Files
		FileInputStream fin1=new FileInputStream("src/java_io/io/Java IO Files/A.txt");
		FileInputStream fin2=new FileInputStream("src/java_io/io/Java IO Files/B.txt");
		FileInputStream fin3=new FileInputStream("src/java_io/io/Java IO Files/C.txt");
		FileInputStream fin4=new FileInputStream("src/java_io/io/Java IO Files/D.txt");
		//Creating Vector object to all the streams
		Vector v=new Vector();
		v.add(fin1);
		v.add(fin2);
		v.add(fin3);
		v.add(fin4);
		//Creating Enumeration object by calling the element method
		Enumeration e=v.elements();
		//Passing Enumeration object in the Constructor
		SequenceInputStream bin=new SequenceInputStream(e);
		int i=0;
		while((i=bin.read())!=-1)
        {
        	System.out.print((char)i);
        }
  		bin.close();
		fin4.close();
		fin3.close();
		fin2.close();
		fin1.close();
	}
}

//Reading data from more than two files