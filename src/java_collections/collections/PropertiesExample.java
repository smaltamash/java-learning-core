package java_collections.collections;
import java.util.Properties;
import java.io.FileReader;
public class PropertiesExample
{
	public static void main(String[] args)throws Exception
	{
		FileReader reader=new FileReader("src/java_collections/collections/Files/db.properties");
		Properties p=new Properties();
		p.load(reader);
		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("password"));
	}
}