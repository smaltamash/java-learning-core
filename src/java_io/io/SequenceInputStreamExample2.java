package java_io.io;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
public class SequenceInputStreamExample2
{
	public static void main(String args[])throws IOException
	{
		FileInputStream fin1=new FileInputStream("src/java_io/io/Java IO Files/testseq1.txt");
		FileInputStream fin2=new FileInputStream("src/java_io/io/Java IO Files/testseq2.txt");
		FileOutputStream fout=new FileOutputStream("src/java_io/io/Java IO Files/testout4.txt");
		SequenceInputStream inst=new SequenceInputStream(fin1,fin2);
		int i=0;
		while((i=inst.read())!=-1)
        {
        	fout.write(i);
        }
		System.out.println("Success...");
  		inst.close();
		fout.close();
		fin2.close();
		fin1.close();
	}
}

//Reading data from two files and writing it to a third file