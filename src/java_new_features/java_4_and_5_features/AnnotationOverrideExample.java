package java_new_features.java_4_and_5_features;
class Animal
{
	void eatSomething()
	{
		System.out.println("Eating Somthing");
	}
}
class Dog extends Animal
{
	@Override
	void eatSomething()
	{
		System.out.println("Eating Foods");
	}
}
public class AnnotationOverrideExample
{
	public static void main(String[] args)
    {
    	Animal a=new Dog();
    	a.eatSomething();
    }
}