package oops_concepts.inheritance_in_java;
// INHERITANCE HAS IS-A RELATIONSHIP
class Employee
{
	float salary=40000;
}
public class Inheritance1 extends Employee
{
	int bonus=10000;
	public static void main(String[] args)
	{
		Inheritance1 obj=new Inheritance1();
		System.out.println("Salary = "+obj.salary);
		System.out.println("Bonus = "+obj.bonus);
	}
}