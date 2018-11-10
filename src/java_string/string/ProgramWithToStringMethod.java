package java_string.string;
public class ProgramWithToStringMethod
{
	int rollNo;
	String name,city;
	ProgramWithToStringMethod(int rollNo,String name,String city)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.city=city;
	}
	public String toString() //Overriding toString() Method
	{
		return rollNo+" "+name+" "+city;
	}
	public static void main(String[]args)
	{
		ProgramWithToStringMethod obj1=new ProgramWithToStringMethod(12,"Seema Kholi","New Delhi");
		ProgramWithToStringMethod obj2=new ProgramWithToStringMethod(3,"Anushka Aggarwal","Banglore");
		System.out.println(obj1); //Compiler automatically writes obj1.toString()
	    System.out.println(obj2); //Compiler automatically writes obj2.toString()
	}
}