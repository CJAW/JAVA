package com.TestAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/*
 * 运用反射读取注解
 */
public class Test {

	public static void main(String[] args){
		
		try {
			Class clazz = Class.forName("com.TestAnnotation.Student");
			
			//获得全部注解
			Annotation[] ann = clazz.getDeclaredAnnotations();
			for(Annotation temp : ann){
				System.out.println(temp);
			}
			
			//通过名字获得单一注解
			Annotation anns = clazz.getAnnotation(Table.class);
			System.out.println(anns);
			
			
			//获得注解的参数的属性
			Field filed = clazz.getDeclaredField("name");
			AnnotationField s = (AnnotationField)filed.getAnnotation(AnnotationField.class);
			System.out.println(s.columnName()+"---"+s.lenth());
						
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
