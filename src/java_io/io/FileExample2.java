package java_io.io;
import java.io.IOException;
import java.io.File;
public class FileExample2
{
	public static void main(String args[])throws IOException
	{
		String path = "";  
		boolean bool = false;  
		// creating  new files  
		File file  = new File("src/java_io/io/Java IO Files/testFile1.txt");  
		file.createNewFile();  
		System.out.println(file);  
		// creating new canonical from file object  
		File file2 = file.getCanonicalFile();  
		// returns true if the file exists  
		System.out.println(file2);  
		bool = file2.exists();  
		// returns absolute pathname  
		path = file2.getAbsolutePath();  
		System.out.println(bool);  
		// if file exists  
		if (bool) 
		{  
			// prints  
			System.out.print(path + " Exists? " + bool);  
		}  

	} 
}
