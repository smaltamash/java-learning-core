package java_io.java_serialization;
//HAS-A Relationship in Serialization
import java.io.Serializable;  
class Address
{  
	String addressLine,city,state;  
	public Address(String addressLine, String city, String state) {  
		this.addressLine=addressLine;  
		this.city=city;  
		this.state=state;  
	}  
}  
public class SerializationExample4Aggregation implements Serializable{  
	int id;  
	String name;  
	Address address; //HAS-A  
	public SerializationExample4Aggregation(int id, String name) 
	{  
		this.id = id;  
		this.name = name;  
	}  
}  
/*
If a class has a reference of another class, all the references must be Serializable 
otherwise serialization process will not be performed. 
In such case, NotSerializableException is thrown at runtime.
Since Address is not Serializable, you can not serialize the instance of Student class.
 */




/*
If there is any static data member in a class, it will not be serialized because static is the part of class not object.

class Employee implements Serializable
{  
	int id;  
	String name;  
	static String company="My Global";//it won't be serialized  
	public Student(int id, String name)
	{  
		this.id = id;  
		this.name = name;  
	}  
}  
 */