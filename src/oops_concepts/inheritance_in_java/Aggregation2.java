package oops_concepts.inheritance_in_java;
public class Aggregation2
{
	int id;
	String name;
	Address address;
	public Aggregation2(int id,String name,Address address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display()
	{
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
	public static void main(String[] args)
	{
		Address address1=new Address("Lucknow","UP","India");
		Address address2=new Address("Chandigarh","Punjab","India");
		Aggregation2 e1=new Aggregation2(12,"Saima",address1);
		Aggregation2 e2=new Aggregation2(4,"Harshita",address2);
		e1.display();
		e2.display();
	}
}