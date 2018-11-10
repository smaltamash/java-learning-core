package oops_concepts.java_oops_misc;
// CALL BY VALUE OR PASS BY VALUE
public class CallByValue 
{
	int data=50;
	void change(int data)
	{
		data=data+100; //changes will be in the local variable only
	}
	public static void main(String[] args)
	{
		CallByValue obj=new CallByValue();
		System.out.println("before change "+obj.data);
		obj.change(500);
		System.out.println("after change "+obj.data);
	}
}
