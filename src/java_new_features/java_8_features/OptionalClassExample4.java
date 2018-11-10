package java_new_features.java_8_features;
import java.util.Optional;
public class OptionalClassExample4
{
	public static void main(String[] args)
	{
		String[] str=new String[10];
		str[5]="Java Optional Class Example"; //Setting value for 5th index
		Optional<String> checkNull=Optional.ofNullable(str[5]);
		checkNull.ifPresent(System.out::println); //Printing value by using method reference
		System.out.println(checkNull.get()); //Printing value by using get() method
		System.out.println(str[5].toLowerCase());
	}
}