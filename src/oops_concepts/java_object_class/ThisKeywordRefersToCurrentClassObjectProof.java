package oops_concepts.java_object_class;
// PROGRAM TO PROVE THAT THIS KEYWORD REFERS TO OBJECT OF CURRENT CLASS
public class ThisKeywordRefersToCurrentClassObjectProof
{
	void m()
	{
		System.out.println(this); //prints same Reference ID
	}
    public static void main(String[] args)
	{
		ThisKeywordRefersToCurrentClassObjectProof obj=new ThisKeywordRefersToCurrentClassObjectProof();
		System.out.println(obj); //prints same Reference ID
		obj.m();
	}
}