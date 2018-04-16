package com.design.pattern.template;

public class Client {
	
	public static void main(String[] args) {
		Student student = new Student();
		student.prepareGotoSchool();
		
		Teacher teacher = new Teacher();
		teacher.prepareGotoSchool();
	}

}
