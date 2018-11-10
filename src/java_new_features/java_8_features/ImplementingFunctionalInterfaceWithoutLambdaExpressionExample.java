package java_new_features.java_8_features;
interface Drawable1
{
	public void draw();
}
public class ImplementingFunctionalInterfaceWithoutLambdaExpressionExample
{
	public static void main(String []args)
	{
		int width=10;
		//without Lambda Expression, Drawable implementaion using Anonymous class
		Drawable1 d=new Drawable1()
		{
			public void draw()
			{
				System.out.println("Drawing "+width);
			}
		};
		d.draw();	
	}
}