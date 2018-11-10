package java_collections.collections;
import java.util.Properties;
import java.io.FileWriter;;; //we can use many semi-colans
public class PropertiesFileCreationExample
{
	public static void main(String[] args)throws Exception
	{
		Properties p=new Properties();
		p.setProperty("user","Gamer");
		p.setProperty("email","gamer@gamer.com");
		p.store(new FileWriter("src/java_collections/collections/Files/info.properties"),"Gamer Properties Example");
	}
}