package oops_concepts.java_object_class;
// THIS KEYWORD CAN BE PASSED AS ARGUMENT IN THE CONSTRUCTOR CALL
class B
{
	ThisKeywordToPassAsArgumentInConstructorCall obj;
	B(ThisKeywordToPassAsArgumentInConstructorCall obj)
	{
		this.obj=obj;
	}
	void display()
	{
		System.out.println(obj.data); //using data member
	}
}
public class ThisKeywordToPassAsArgumentInConstructorCall
{
	int data=10;
	ThisKeywordToPassAsArgumentInConstructorCall()
	{
		B obj=new B(this);
		obj.display();
	}
	public static void main(String[] args)
	{
		ThisKeywordToPassAsArgumentInConstructorCall obj=new ThisKeywordToPassAsArgumentInConstructorCall();
	}
}