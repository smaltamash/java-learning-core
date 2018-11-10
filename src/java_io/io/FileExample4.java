package java_io.io;
import java.io.IOException;
import java.io.File;
public class FileExample4
{
	public static void main(String args[])throws IOException
	{
		File dir=new File("src/java_io/io/Java IO Files");
		File files[]=dir.listFiles(); 
		for(File file:files)
		{  
			System.out.println(file.getName()+" Can Write: "+file.canWrite()+"Is Hidden: "+file.isHidden()+" Length: "+file.length()+" bytes");
		}
	} 
}
