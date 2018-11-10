package java_io.io;
import java.io.IOException;
import java.io.Reader;
import java.io.FilterReader;
import java.io.FileReader;
class CustomFilterReader extends FilterReader 
{  
    CustomFilterReader(Reader in) 
    {  
        super(in);  
    }  
    public int read() throws IOException 
    {  
    	int x=super.read();
    	if((char)x==' ')
    	{
    		return((int)'?');
    	}
    	else
    	{
    		return x;
    	}  
    }  
}                
public class FilterReaderExample
{
	public static void main(String args[])throws IOException
	{
		 Reader r = new FileReader("/home/auzad/Desktop/Java IO Files/Record2.txt");   
            CustomFilterReader filterReader = new CustomFilterReader(r);             
            int k;  
            while((k = filterReader.read()) != -1) 
            {  
                System.out.print((char) k);  
            }
            filterReader.close();  
            r.close();
	} 
}
