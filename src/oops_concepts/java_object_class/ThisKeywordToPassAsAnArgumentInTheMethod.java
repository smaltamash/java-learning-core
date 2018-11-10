package oops_concepts.java_object_class;
// THIS KEYWORD CAN BE USED AS AN ARGUMENT IN THE METHOD
public class ThisKeywordToPassAsAnArgumentInTheMethod
{
	void m(ThisKeywordToPassAsAnArgumentInTheMethod obj)
	{
		System.out.println("Method is Invoked");
	}
	void p()
	{
		m(this);
	}
	public static void main(String[] args)
	{
		ThisKeywordToPassAsAnArgumentInTheMethod obj=new ThisKeywordToPassAsAnArgumentInTheMethod();
		obj.p();
	}
}