package oops_concepts.java_polymorphism;
class Bike2
{
	final void run()
	{
		System.out.println("Running");
	}
}
public class FinalMethods2 extends Bike2
{
	public static void main(String[] args)
	{
		new FinalMethods2().run(); 
	}
}
// We cannot Override a final method but we can inherit it