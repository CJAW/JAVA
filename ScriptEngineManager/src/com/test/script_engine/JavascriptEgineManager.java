package com.test.script_engine;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;
import java.util.List;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * 在javascript中使用java包中的类
 * @author user
 *
 */

public class JavascriptEgineManager {

	public static void main(String[] args) throws ScriptException, FileNotFoundException {
		//获得引擎
		ScriptEngineManager js = new ScriptEngineManager();
		ScriptEngine se = js.getEngineByName("javascript");
		
		//在javascript代码中导入java包，使用java包中的类
		String str = "import Package(java.util); var list = Arrays.asList([\"a\",\"b\"]);";
		
		se.eval(str); //放入引擎中
		
		List<String> list1= (List<String>) se.get("list"); //转为java代码
		
		
			System.out.println(list1.get(0));
		//引入js文件，放在src文件下即可
			URL url = JavascriptEgineManager.class.getClassLoader().getResource("s.js");
			se.eval(new FileReader(url.getPath()));
		
	}
}
