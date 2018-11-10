package java_io.java_serialization;
import java.io.Serializable;  
public class Student1 implements Serializable
{  
	int id;  
	String name;  
	transient int age;//Now it will not be serialized  
	public Student1(int id, String name,int age) 
	{  
		this.id = id;  
		this.name = name;  
		this.age=age;  
	}  
} 