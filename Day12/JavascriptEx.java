package Day12;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavascriptEx {
	public static void main(String[] args) throws FileNotFoundException, ScriptException {
		ScriptEngine se=new ScriptEngineManager().getEngineByName("Nashorn");
		se.eval(new FileReader("C:\\Users\\Arasakumaran\\eclipse-workspace\\arasa\\Samplejava.js"));
	}
}
