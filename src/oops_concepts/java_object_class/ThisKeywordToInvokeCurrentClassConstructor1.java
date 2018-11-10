package oops_concepts.java_object_class;
// THIS KEYWORD CAN BE USED TO INVOKE CURRENT CLASS CONSTRUCTOR
class A1
{
	int a=8;
	A1()
	{
		a++;
		System.out.println("Hello A1");
	}
	A1(int x)
	{
		this(); //Default Constructor called, this() constructor should be the first statement always 
		System.out.println(x+" "+a);
    }
}
public class ThisKeywordToInvokeCurrentClassConstructor1
{
	public static void main(String args[])
	{
		A1 obj=new A1(10);
	}
}

/*
class A1
{
	int a=8;
	A1()
	{
		a++;
		System.out.println("Hello A1");
	}
	A1(int x)
	{
		//this(); //Default Constructor called, this() constructor should be the first statement always
		System.out.println(x+" "+a);
    }
}
public class ThisKeywordToInvokeCurrentClassConstructor1
{
	public static void main(String args[])
	{
		A1 a=new A1(10); //Default Constructor is not called in this situation keep in mind 
	}
}
*/