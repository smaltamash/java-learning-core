package java_new_features.java_4_and_5_features;
//Creating Generic class
class MyGen<T>
{
	T obj;
	void add(T obj)
	{
		this.obj=obj;
	}
	T get()
	{
		return obj;
	}
}
//Using Generic class
public class GenericsExample3GenericClass
{
	public static void main(String[] args)
  {
  	MyGen<Integer> m=new MyGen<Integer>();
  	m.add(2);
  	//m.add("Vaishnavi"); //Compile Time Error
  	System.out.println(m.get());
  }
}