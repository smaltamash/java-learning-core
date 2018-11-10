package java_io.java_serialization;
import java.io.Serializable;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class SerializationExample1
{
	public static void main(String args[])throws IOException
	{
		Student s1=new Student(54,"Heena Khan");
		FileOutputStream fout=new FileOutputStream("src/java_io/io/Java IO Files/fileSerialization.txt");
		ObjectOutputStream oout=new ObjectOutputStream(fout);
        oout.writeObject(s1);
        oout.flush();
        System.out.println("Success...");
	} 
}