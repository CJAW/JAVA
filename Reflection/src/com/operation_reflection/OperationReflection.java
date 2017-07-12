package com.operation_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.mytest.reflection.Student;

/**
 * 运用反射动态操作类
 * 动态操作类是通过被操做类的构造方法实现
 * @author user
 *
 */

public class OperationReflection {

	public static void main(String[] args) {
		
		String path = "com.mytest.reflection.Student";
		
		try {
			Class<Student> c= (Class<Student>) Class.forName(path);
			
			//操作属性
			
			Student s = c.newInstance(); //调用student构造方法
			
			Field field = c.getDeclaredField("name"); //调用属性
			
			field.setAccessible(true);  //禁止检查私有属性
			
		    field.set(s,"111");         //通过使用构造方法设置属性的值
		    
			System.out.println(s.getName());
			
			
			//操作方法
			Student s1 = c.newInstance(); //调用student构造方法
			
			Method me = c.getDeclaredMethod("setName",String.class);
			
			me.invoke(s1, "sss"); //通过使用构造方法设置方法参数的值
			
			System.out.println(s1.getName());
			
			
			//操作构造方法
			Constructor con = c.getDeclaredConstructor(String.class,int.class,int.class);
			Student s2 = (Student)con.newInstance("sss",12,34);
			System.out.println(s2.getName()+"------"+s2.getAge()+"-------"+s2.getId());
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
