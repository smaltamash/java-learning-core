package java_new_features.java_7_features;
import java.io.FileOutputStream;
public class TryWithResourcesExample1
{		
	public static void main(String[] args)
    {
    	//Using try with resources
    	try(FileOutputStream fOS=new FileOutputStream("src/java_new_features/java_7_features/Files/Anita.txt"))
    	{
    		String msg="Hello i am Anita";
    		byte bArray[]=msg.getBytes(); //Converting String into byte array
    		fOS.write(bArray);
    		System.out.println("Message Written to file Successfully");
    	}
    	catch(Exception e) 
    	{
    		System.out.println(e);
    	}
    }
}