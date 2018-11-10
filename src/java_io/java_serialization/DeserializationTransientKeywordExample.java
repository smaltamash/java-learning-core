package java_io.java_serialization;
//the code for Deserialization.
import java.io.ObjectInputStream;
import java.io.FileInputStream;
public class DeserializationTransientKeywordExample //Depersist is the process of Deserialization
{  
	public static void main(String args[])throws Exception
	{  
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("src/java_io/io/Java IO Files/SerializeFile.txt"));  
		Student1 s=(Student1)in.readObject();  
		System.out.println(s.id+" "+s.name+" "+s.age);  
		in.close();  
	}  
}  