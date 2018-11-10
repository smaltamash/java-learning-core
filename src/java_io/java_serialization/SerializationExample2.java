package java_io.java_serialization;
import java.io.Serializable;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class SerializationExample2
{
	public static void main(String args[])throws IOException,ClassNotFoundException //Or write throws Exception 
	{
		ObjectInputStream oin=new ObjectInputStream(new FileInputStream("src/java_io/io/Java IO Files/fileSerialization.txt"));
        Student s=(Student)oin.readObject();
        System.out.println(s.id+" "+s.name);
        oin.close();
	} 
}