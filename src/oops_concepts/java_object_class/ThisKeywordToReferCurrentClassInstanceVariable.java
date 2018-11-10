package oops_concepts.java_object_class;
// THIS KEYWORD CAN BE USED TO REFER CURRENT CLASS INSTANCE VARIABLE 
public class ThisKeywordToReferCurrentClassInstanceVariable
{
	int rollno;
	String name;
	float fee;
	ThisKeywordToReferCurrentClassInstanceVariable(int rollno,String name,float fee)
	{
		this.rollno=rollno; //if you do not use this.rollno=rollno and use rollno=rollno, it will create ambiguity and not take the instance variable but take the formal parameter
		this.name=name;
		this.fee=fee;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee);
	}
	public static void main(String args[])
	{
		ThisKeywordToReferCurrentClassInstanceVariable obj1=new ThisKeywordToReferCurrentClassInstanceVariable(23,"Geeta",123.22f); //if you write 123.22 it will give compile time error because compiler automatically takes any floating point value provided in actual parameter as double  by default and doulbe cant be converted to float implicitly so you have to specify f or F for float
		ThisKeywordToReferCurrentClassInstanceVariable obj2=new ThisKeywordToReferCurrentClassInstanceVariable(3,"Aliya",163.231f);
		obj1.display();
		obj2.display();
	}
}