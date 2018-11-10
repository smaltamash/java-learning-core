package java_reflection.reflection;
import java.lang.reflect.Method;
public class AccessingPrivateMethodsFromOtherClass 
{
	public static void main(String args[])throws Exception
	{
		Class c=Class.forName("PrivateMethodClass");
		Object o=c.newInstance();
		Method m=c.getDeclaredMethod("message",null);
		m.setAccessible(true);
		m.invoke(o,null);
	}
} 