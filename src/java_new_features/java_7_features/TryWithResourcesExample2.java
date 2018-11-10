package java_new_features.java_7_features;
import java.io.FileOutputStream;    
public class TryWithResourcesExample2 
{    
	public static void main(String args[])
	{      
		try(    FileOutputStream fileOutputStream=  
				new FileOutputStream("src/java_new_features/java_7_features/Files/Shaniya.txt"))
		{  
			// -----------------------------Code to write data into file--------------------------------------------//  
			String msg = "Hello Shaniya Here!";      
			byte byteArray[] = msg.getBytes();  // Converting string into byte array      
			fileOutputStream.write(byteArray);  // Writing  data into file  
			System.out.println("Data written successfully!");  
		}
		catch(Exception exception)
		{  
			System.out.println(exception);  
		}  
		finally
		{  
			System.out.println("Finally executes after closing of declared resources.");  
		}  
	}      
}  