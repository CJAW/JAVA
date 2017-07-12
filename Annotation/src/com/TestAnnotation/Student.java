package com.TestAnnotation;

@Table(TablelName="student_message")
public class Student {
	
	@AnnotationField(columnName="studentName",lenth=12)
	private String name;
	@AnnotationField(columnName="Studentage",lenth=10)
	private int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Student() {

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
