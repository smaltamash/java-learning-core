package java_new_features.java_8_features;
interface Sayable10
{
	//Default method
	default void say()
	{
		System.out.println("Hello, this is default method");
	}
	//Abstract method
	void sayMore(String msg);
	//Static method
	static void sayLouder(String msg)
	{
		System.out.println(msg);
	}
}
public class StaticMethodInInterfaceExample1 implements Sayable10
{
	public void sayMore(String msg) //Implementing abstract method
	{
		System.out.println(msg);
	}
	public static void main(String[] args)
	{
		StaticMethodInInterfaceExample1 dm=new StaticMethodInInterfaceExample1();
		dm.say(); //Calling default method
		dm.sayMore("Work is Worship"); //Calling abstract method
		Sayable10.sayLouder("Hellooooooo......."); //Calling static method 
	}
}