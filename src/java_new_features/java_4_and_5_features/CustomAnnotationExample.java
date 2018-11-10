package java_new_features.java_4_and_5_features;
//Creating Annotation
import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation
{
	int value();
}
//Appliying Annotation
class Hello
{
	@MyAnnotation(value=10)
	public void sayHello()
	{
		System.out.println("Hello Annotation");
	}

}
//Accessing Annotation
public class CustomAnnotationExample
{
	public static void main(String[] args)throws Exception
  {
  	Hello h=new Hello();
  	Method m=h.getClass().getMethod("sayHello");
  	MyAnnotation manno=m.getAnnotation(MyAnnotation.class);
  	System.out.println("Value is : "+manno.value());
  }
}