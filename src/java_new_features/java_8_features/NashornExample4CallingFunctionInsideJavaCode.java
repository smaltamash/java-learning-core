package java_new_features.java_8_features;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.Invocable;
import java.io.FileReader;
public class NashornExample4CallingFunctionInsideJavaCode
{
	public static void main(String[] args)throws Exception
	{
		//Creating Script Engine
		ScriptEngine ee=new ScriptEngineManager().getEngineByName("Nashorn");
		//Reading Nashorn File
		ee.eval(new FileReader("src/java_new_features/java_8_features/Files/hello3.js"));
		Invocable invocable=(Invocable)ee;
		//Calling function
		invocable.invokeFunction("functionDemo1");
		//Calling a function and passing variable as well 
		invocable.invokeFunction("functionDemo2","Nashorn");
	}
}