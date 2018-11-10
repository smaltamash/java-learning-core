package java_io.java_serialization;
import java.io.Serializable;
class Student implements Serializable
{
	int id;
	String name;
	public Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}
