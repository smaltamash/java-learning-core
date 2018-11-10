package java_io.io;
import java.io.IOException;
import java.io.File;
public class FileExample3FilesInPath
{
	public static void main(String args[])throws IOException
	{
		File file=new File("src/java_io/io/Java IO Files");
		String filenames[]=file.list(); //returns all the files in specified path
		for(String filename:filenames)
		{
			System.out.println(filename);
		}
		
	} 
}
