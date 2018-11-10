package java_new_features.java_8_features;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.FileReader;
public class NashornExample1ExecutingJavaScriptFileInJavaCode
{
	public static void main(String[] args)throws Exception
	{
		//Creating Script Engine
		ScriptEngine ee=new ScriptEngineManager().getEngineByName("Nashorn");
		//Reading nashorn File
		ee.eval(new FileReader("src/java_new_features/java_8_features/Files/hello.js"));
	}
}