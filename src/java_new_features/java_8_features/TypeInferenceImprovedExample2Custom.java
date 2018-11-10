package java_new_features.java_8_features;
class GenericClass<X>
{
	X name;
	public void setName(X name)
	{
		this.name=name;
	}
	public X getName()
	{
		return name;
	}
	public String genericMethod(GenericClass<String> x)
	{
		x.setName("Jessica");
		return x.name;
	}
}
public class TypeInferenceImprovedExample2Custom
{
	public static void main(String[] args)
	{
		GenericClass<String> genericClass=new GenericClass<String>();
		genericClass.setName("Priyanka");
		System.out.println(genericClass.getName());
		GenericClass<String> genericClass2=new GenericClass<>();
		genericClass2.setName("Kajal");
		System.out.println(genericClass2.getName());
		//New improved type inference
		System.out.println(genericClass2.genericMethod(new GenericClass<>()));
	}
}