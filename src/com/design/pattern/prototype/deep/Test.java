package com.design.pattern.prototype.deep;

public class Test {
	
	public static void main(String[] args)  {
		Student2 stu1 = new Student2();
		stu1.setNumber(123);
		
		Student2 stu2 = (Student2) stu1.clone();
		System.out.println(stu2);
		
		System.out.println(stu1.getNumber());
		System.out.println(stu2.getNumber());
		
		stu2.setNumber(321);
		
		System.out.println(stu1.getNumber());
		System.out.println(stu2.getNumber());
	
		System.out.println(stu1 == stu2);
		
	
		
		System.out.println("-----------------------------------------------------------");
		
		/*Address add = new Address();
		add.setAdd("杭州市");
		
		Student stu1 = new Student();
		stu1.setNumber(123);
		stu1.setAddress(add);
		
		Student stu2 = (Student) stu1.clone();
		
		System.out.println(stu1.getAddress().getAdd());
		System.out.println(stu2.getAddress().getAdd());
		add.setAdd("南京市");
		System.out.println(stu1.getAddress().getAdd());
		System.out.println(stu2.getAddress().getAdd());*/
		
		//浅拷贝只是复制了add变量的引用，并没有真正开辟新的空间，将值复制后再将引用返回给新对象
		
	}

}
