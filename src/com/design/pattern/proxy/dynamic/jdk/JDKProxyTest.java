package com.design.pattern.proxy.dynamic.jdk;

public class JDKProxyTest {

	public static void main(String[] args) {
		
		Person obj = (Person) new Father().getInstance(new Son());
		obj.job();
		//有一个问题，执行下行代码就会代理对象会运行两次
		System.out.println(obj);
		//System.out.println(obj.getClass());
		
	}
	
}
