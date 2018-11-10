package java_io.io;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.DeflaterOutputStream;
public class DeflaterExampleCompressingFile
{
	public static void main(String args[])throws IOException
	{
		FileInputStream fin=new FileInputStream("src/java_io/io/Java IO Files/File Compression and Decompression/Deflater1.java");
		FileOutputStream fout=new FileOutputStream("src/java_io/io/Java IO Files/File Compression and Decompression/Deflater1Compressed.txt");
		DeflaterOutputStream dout=new DeflaterOutputStream(fout);
		int i;
		while((i=fin.read())!=-1)
		{
			dout.write((byte)i);
			dout.flush();
		}
		fin.close();
		dout.close();
		System.out.println("Deflater1 File Compressed to Deflater1Compressed File.");
	} 
}

