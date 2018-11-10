package java_io.io;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
public class SequenceInputStreamExample1
{
	public static void main(String args[])throws IOException
	{
		FileInputStream fin1=new FileInputStream("src/java_io/io/Java IO Files/testseq1.txt");
		FileInputStream fin2=new FileInputStream("src/java_io/io/Java IO Files/testseq2.txt");
		SequenceInputStream inst=new SequenceInputStream(fin1,fin2);
		int i=0;
		while((i=inst.read())!=-1)
        {
        	System.out.print((char)i);
        }
  		inst.close();
		fin2.close();
		fin1.close();
	}
}

//fist data of fi1e will be printed then data of fin2 will be printed