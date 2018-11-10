package java_new_features.java_8_features;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptContext;
import javax.script.Bindings;
import java.io.FileReader;
public class NashornExample3SettingJavaScriptVariableInJavaFile
{
	public static void main(String[] args)throws Exception
	{
		//Creating Script Engine
		ScriptEngine ee=new ScriptEngineManager().getEngineByName("Nashorn");
		//Bulding Script and Define scope of script
		Bindings bind=ee.getBindings(ScriptContext.ENGINE_SCOPE);
		bind.put("name","Nashorn Here");
		//Reading Nashorn File
		ee.eval(new FileReader("src/java_new_features/java_8_features/Files/hello2.js"));
	}
}