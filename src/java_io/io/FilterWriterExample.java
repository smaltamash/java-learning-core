package java_io.io;
import java.io.IOException;
import java.io.Writer;
import java.io.FilterWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
class CustomFilterWriter extends FilterWriter 
{  
	CustomFilterWriter(Writer out) 
	{  
		super(out);  
	}  
	public void write(String str) throws IOException 
	{  
		super.write(str.toLowerCase());  
	}  
}                
public class FilterWriterExample
{
	public static void main(String args[])throws IOException
	{
		FileWriter fw = new FileWriter("src/java_io/io/Java IO Files/Record2.txt");   
		CustomFilterWriter filterWriter = new CustomFilterWriter(fw);             
		filterWriter.write("I LOVE MY COUNTRY");  
		filterWriter.close();  
		FileReader fr = new FileReader("src/java_io/io/Java IO Files/Record2.txt");  
		BufferedReader bufferedReader = new BufferedReader(fr);  
		int k;  
		while((k = bufferedReader.read()) != -1) 
		{  
			System.out.print((char) k);  
		}  
		bufferedReader.close();
	} 
}
