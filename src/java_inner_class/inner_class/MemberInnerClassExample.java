package java_inner_class.inner_class;
public class MemberInnerClassExample
{
	private static int data=89;
	private boolean state=true;
	int data2=6;
	class MemberInnerClass
	{
		void msg()
		{
			System.out.println("Message "+data+" "+state+" "+data2);
		}
		//static void msg1() //We cannot have static method in non-static class
		//{
		//	System.out.println("Static Message");
		//}
	}
	public static void main(String[]args)
	{
		MemberInnerClassExample obj=new MemberInnerClassExample();
		MemberInnerClass in=obj.new MemberInnerClass();
		in.msg();
	}
}
 