package java_new_features.java_8_features;
interface Messageable
{
	Message getMessage(String msg);
}
class Message
{
	Message(String msg)
	{
		System.out.println(msg);
	}
}
public class MethodReferenceExample8UsingConstructor
{
	public static void main(String[] args)
	{
		Messageable hello=Message::new;
		hello.getMessage("Hello");
	}
}