package java_io.java_serialization;
//IS-A Relationship in Serialization
import java.io.Serializable;
import java.io.IOException;
class Person implements Serializable
{
	int id;
	String name;
	public Person(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}
public class SerializationExample3SubPerson extends Person
{
	String course;
	int fee;
	public SerializationExample3SubPerson(int id,String name,String course,int fee)
	{
		super(id,name);	
		this.course=course;
		this.fee=fee;
	} 
}
/*
If a class implements serializable then all its sub classes will also be serializable.
Now you can serialize the SerializableExample3SubPerson class object that extends the Person class which is Serializable.
Parent class properties are inherited to subclasses so if parent class is Serializable, 
subclass would also be.
 */