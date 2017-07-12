package com.annotation.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * 自定义注解
 * @author user
 *
 */
@Target(value = {ElementType.METHOD }) //注解的作用范围 有方法，类的范围。
@Retention(RetentionPolicy.RUNTIME)  //注解读取的范围
public @interface Demo01 {

	//注解中的参数 类型＋参数名，可以有默认值
	String name() default"";       
	int age();
}
