package java_new_features.java_7_features;
class GenericClass<X>
{
	<T> GenericClass(T  t)
	{
		System.out.println(t);
	} 
}
public class TypeInferenceWithGenericConstructorExample
{ 
	public static void main(String []args)
	{
		GenericClass<String>gc2=new GenericClass<>("Hello");
		new GenericClass<String>("Helloo");
		new GenericClass<>("Hellooo");
		
	}
}