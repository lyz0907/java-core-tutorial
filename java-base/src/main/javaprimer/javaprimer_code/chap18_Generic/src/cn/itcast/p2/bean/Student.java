package org.alpha.javabase.javaprimer.javaprimer_code.chap18_Generic.src.cn.itcast.p2.bean;

public class Student extends Person {

	public Student() {
		super();
		
	}

	public Student(String name, int age) {
		super(name, age);
		
	}

	@Override
	public String toString() {
		
		return "Student:"+getName()+":"+getAge();
	}
	
	

	
}