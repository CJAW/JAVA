package com.javassist;

import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtConstructor;
import javassist.CtField;
import javassist.CtMethod;

/**
 * 测试字节码使用javassist，可以动态的编译。
 * @author user
 *
 */
public class TestJavassist {

	     //使用javassist创建一个新的类
	public static void main(String[] args) throws Exception {
		ClassPool pool = ClassPool.getDefault(); //获得类池
		CtClass cc = pool.makeClass("com.javassist.User");//生成的类的路径
		
		//创建属性
		CtField field = CtField.make("private String name;", cc);
		CtField field1 = CtField.make("private int age;", cc);
		cc.addField(field);
		cc.addField(field1);
		
		//创建方法
		CtMethod method = CtMethod.make("public void getName(){return name;}",cc);
		CtMethod method1 = CtMethod.make("public void getAge(){return age;}",cc);
		CtMethod method2= CtMethod.make("public void getName(String name){this.name = name;}",cc);
		CtMethod method3= CtMethod.make("public void getName(int age){this.age=age;}",cc);
		cc.addMethod(method);
		cc.addMethod(method1);
		cc.addMethod(method3);
		cc.addMethod(method2);
		
		//创建构造方法
		CtConstructor con = new CtConstructor(new CtClass[]{pool.get("java.lang.String"),CtClass.intType}, cc);//有参
		con.setBody("{this.name= name;this.age = age;}");
		
		CtConstructor con1 = new CtConstructor(null, cc); // 无参构造器
		
		cc.addConstructor(con1);
		cc.addConstructor(con);
		
		cc.writeFile("/Users/user/Desktop/PHP/");
		
	}

}
