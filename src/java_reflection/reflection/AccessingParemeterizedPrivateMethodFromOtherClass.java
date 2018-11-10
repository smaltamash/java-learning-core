package java_reflection.reflection;
import java.lang.reflect.*;	
public class AccessingParemeterizedPrivateMethodFromOtherClass 
{
	public static void main(String args[])throws Exception
	{
		Class c=ParameterizedPrivateMethodClass.class;
		Object obj=c.newInstance();
		Method m=c.getDeclaredMethod("cube",new Class[]{int.class});
		m.setAccessible(true);
		m.invoke(obj,4);
	}
} 