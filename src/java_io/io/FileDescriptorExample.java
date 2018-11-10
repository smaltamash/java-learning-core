package java_io.io;
import java.io.IOException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class FileDescriptorExample
{
	public static void main(String args[])throws IOException
	{
		FileDescriptor fd = null;  
		byte[] b = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58 };  

		FileOutputStream fos = new FileOutputStream("src/java_io/io/Java IO Files/Record.txt");  
		FileInputStream fis = new FileInputStream("src/java_io/io/Java IO Files/Record.txt");  
		fd = fos.getFD();  
		fos.write(b);  
		fos.flush();  
		fd.sync(); //confirms data to be written to the disk  
		int value = 0;  
		//for every available bytes  
		while ((value = fis.read()) != -1)
		{  
			char c = (char) value; //converts bytes to char  
			System.out.print(c);  
		}  
		System.out.println("\nSync() successfully executed!!");
		fis.close();
		fos.close();
	} 
}
