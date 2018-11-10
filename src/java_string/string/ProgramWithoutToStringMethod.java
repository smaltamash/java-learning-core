package java_string.string;
public class ProgramWithoutToStringMethod
{
	int rollNo;
	String name,city;
	ProgramWithoutToStringMethod(int rollNo,String name,String city)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.city=city;
	}
	public static void main(String[]args)
	{
		ProgramWithoutToStringMethod obj1=new ProgramWithoutToStringMethod(12,"Seema Kholi","New Delhi");
		ProgramWithoutToStringMethod obj2=new ProgramWithoutToStringMethod(3,"Anushka Aggarwal","Banglore");
		System.out.println(obj1); //Compiler automatically writes obj1.toString()
	    System.out.println(obj2); //Compiler automatically writes obj2.toString()
	}
}