package com.TestAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(value = {ElementType.TYPE }) //注解的作用范围 有方法，类的范围。
@Retention(RetentionPolicy.RUNTIME)  //注解读取的范围
public @interface Table {

		String TablelName();

}
