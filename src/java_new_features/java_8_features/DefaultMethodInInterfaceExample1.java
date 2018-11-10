package java_new_features.java_8_features;
interface Sayable9
{
	//Default method
	default void say()
	{
		System.out.println("Hello, this is default method");
	}
	//Abstract method
	void sayMore(String msg);
}
public class DefaultMethodInInterfaceExample1 implements Sayable9
{
	public void sayMore(String msg) //Implementing abstract method
	{
		System.out.println(msg);
	}
	public static void main(String[] args)
	{
		DefaultMethodInInterfaceExample1 dm=new DefaultMethodInInterfaceExample1();
		dm.say(); //Calling default method
		dm.sayMore("Work is Worship"); //Calling abstract method 
	}
}