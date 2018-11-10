package oops_concepts.java_polymorphism;
class Animal8
{
	void eat()
	{
		System.out.println("Animal8 Eating");
	}
}
public class DowncastingExample extends Animal8
{
	void eat()
	{
		System.out.println("Dog Eating");
	}
	void display()
	{
		System.out.println("Display Function");
	}
	public static void main(String[] args)
	{
		Animal8 obj=new DowncastingExample();
        obj.eat();
        //obj.display(); //this will not work 
        DowncastingExample ob=(DowncastingExample)obj;
        ob.display(); //now this will work
	}
}
