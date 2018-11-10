package oops_concepts.java_oops_misc;
// JAVA DOES NOT HAVE CALL BY REFERENCE OR PASS BY REFERENCE
public class CallyByReferenceNotInJava 
{
	int data=20;
	void change(CallyByReferenceNotInJava obj)
	{
		obj.data=obj.data+100; //changes will be in the instance variable
	}
	public static void main(String[] args)
	{
		CallyByReferenceNotInJava obj=new CallyByReferenceNotInJava();
		System.out.println("before change "+obj.data);
		obj.change(obj);
		System.out.println("after change "+obj.data);
	}
}
