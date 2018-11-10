package java_new_features.java_8_features;
interface Sayable7
{
	void say(String msg); //Abstract method
}
@FunctionalInterface	
interface FunctionalInterfaceExample3InvalidFunctionalInterface extends Sayable7
{
	//Invalid '@FunctionalInterface' annotation; FunctionalInterfaceExample3InvalidFunctionalInterface is not a functional interface
	//void doIt(); //Uncomment this line
}