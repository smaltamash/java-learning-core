package java_io.java_serialization;
//The code to serialize the object.
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class SerializationTransientKeywordExample //Persist is process of Serialization
{  
	public static void main(String args[])throws Exception
	{  
		Student1 s1 =new Student1(11,"Rashika",21);//creating object  
		//writing object into file  
		FileOutputStream f=new FileOutputStream("src/java_io/io/Java IO Files/SerializeFile.txt");  
		ObjectOutputStream out=new ObjectOutputStream(f);  
		out.writeObject(s1);  
		out.flush();  
		out.close();  
		f.close();  
		System.out.println("Success...");  
	}  
}   