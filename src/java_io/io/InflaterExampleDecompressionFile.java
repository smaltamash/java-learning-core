package java_io.io;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.InflaterInputStream;
public class InflaterExampleDecompressionFile
{
	public static void main(String args[])throws IOException
	{
		FileInputStream fin=new FileInputStream("src/java_io/io/Java IO Files/File Compression and Decompression/Deflater1Compressed.txt");
		InflaterInputStream iin=new InflaterInputStream(fin);
		FileOutputStream fout=new FileOutputStream("src/java_io/io/Java IO Files/File Compression and Decompression/Deflater1Decompressed.java");
		int i;
		while((i=iin.read())!=-1)
		{
			fout.write((byte)i);
			fout.flush();
		}
		fout.close();
		iin.close();
		fin.close();
		System.out.println("Deflater1Compressed File Decompressed to Deflater1Decompressed File.");
	} 
}

