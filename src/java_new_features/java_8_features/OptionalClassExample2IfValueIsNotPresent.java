package java_new_features.java_8_features;
import java.util.Optional;
public class OptionalClassExample2IfValueIsNotPresent
{
	public static void main(String[] args)
	{
		String[] str=new String[10];
		Optional<String> checkNull=Optional.ofNullable(str[5]);
		if(checkNull.isPresent()) //Check for value is present or not
		{
			String lowerCase=str[5].toLowerCase();
		    System.out.println(lowerCase);
		}
		else
		{
			System.out.println("String value is not present");
		}
	}
}