package java_new_features.java_8_features;
@FunctionalInterface //It is optional
interface Drawable2
{
	public void draw();
}
public class ImplementingFunctionalInterfaceWithLambdaExpression
{
	public static void main(String []args)
	{
		int width=10;
		//with Lambda Expression
		Drawable2 d=()->{
			System.out.println("Drawing "+width);
		};
		d.draw();
	}
}