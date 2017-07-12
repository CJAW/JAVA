package com.mytest.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 测试反射
 * @author user
 *
 */

public class TestReflection {
	
	public static void main(String[] args) {

		String path = "com.mytest.reflection.Student";
		try {
			Class c = Class.forName(path);
			
			//调用方法
			Method[] me = c.getDeclaredMethods();  //可以调用所有的方法
			Method[] me1 = c.getMethods(); //可以调用public的方法
			Method  me2 = c.getDeclaredMethod("setName",String.class);//调用指定的方法，含有参数类型
			Method me3 = c.getDeclaredMethod("getName",null); //调用指定的方法，不含有参数类型
			for(Method temp:me){
				System.out.println(temp);
			}
			
			//调用属性
			Field[] f1 = c.getDeclaredFields();
			Field[] f2 = c.getFields();
			Field f3 = c.getDeclaredField("name");
			
			//调用构造方法
			Constructor[] con = c.getDeclaredConstructors();//可以调用所有不含参数的构造方法
			Constructor cons = c.getDeclaredConstructor(String.class,int.class,int.class);//可以调用有参数类型的构造方法


		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
