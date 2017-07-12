package com.javacompile;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

/**
 * 使用javacompile实现动态编译代码
 * @author user
 *
 */

public class TestJavaCompile {

	public static void main(String[] args) {
		JavaCompiler jcom = ToolProvider.getSystemJavaCompiler();
		int result = jcom.run(null, null, null,"/Users/user/Desktop/java/TypeTest.java");//可以加入java文件路径。
		
		System.out.println(result);
	}
}
