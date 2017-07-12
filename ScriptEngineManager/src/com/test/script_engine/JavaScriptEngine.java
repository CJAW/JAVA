package com.test.script_engine;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * 测试javascript的脚本引擎
 * 使java可以执行js,js可以执行java
 * 使用Rhino的javascript脚本引擎
 * @author user
 *
 */

public class JavaScriptEngine {
	
	public static void main(String[] args) {
		
		//获取脚本引擎
		ScriptEngineManager script = new ScriptEngineManager();
		ScriptEngine s = script.getEngineByName("javascript");
		
		//定义变量,存储到引擎的上下文中
		s.put("msg", "hello");
		
		//js
		String str = "var user = {name:'us',age:12};";
		str +="print(user.name);";
		
		//创建javascript函数
		String strmetho = "function add(a,b){var sum = a+b;return sum;}";
		
		//执行 javascript代码
		try {
			
			s.eval(str);//加载到引擎中，并执行。
			
		   //执行javascript的函数,需要实现invokecable接口
			
           s.eval(strmetho);//加载到引擎中
           
           Invocable jscript = (Invocable) s; //取得调用接口
           
           Object result = jscript.invokeFunction("add",new Object[]{1,2}); //执行函数
           
		   System.out.println(result);
           
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
