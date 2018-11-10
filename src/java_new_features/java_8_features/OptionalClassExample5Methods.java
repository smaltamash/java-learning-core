package java_new_features.java_8_features;
import java.util.Optional;
public class OptionalClassExample5Methods
{
	public static void main(String[] args)
	{
		String[] str=new String[10];
		str[5]="Java Optional Class Example"; //Setting value for 5th index
		//It returns empty instance of Optional class
		Optional<String> empty=Optional.empty();
		System.out.println(empty);	
		//It returns a non-empty Optional
		Optional<String> value=Optional.of(str[5]);
		//If value is present, it returns an Optional otherwise returns an empty Optional
		System.out.println("Filtered Value :"+value.filter((s)->s.equals("Abc")));
		System.out.println("Filtered Value :"+value.filter((s)->s.equals("Java Optional Class Example")));
		//It returns value of an Optional, if value is not present, it throws an NoSuchElementException
		System.out.println("Getting value :"+value.get());
		//It returns hashCode of the value
		System.out.println("Getting hashCode :"+value.hashCode());
		//It returns true if value is present, otherwise false
		System.out.println("Is value Present :"+value.isPresent());
		//It returns non-empty Optional if value is present, otherwise returns an empty Optional
		System.out.println("Nullable Optional :"+Optional.ofNullable(str[5]));
		//It returns value if available, otherwise returns specified value
		System.out.println("orElse :"+value.orElse("Value is not present"));
		System.out.println("orElse :"+empty.orElse("Value is not present"));
		value.ifPresent(System.out::println); //Printing value by using method reference
	}
}